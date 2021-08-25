package module9.homework3;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static String movementList = "data/movementList.csv";
    public static void main(String[] args) throws Exception{
        double sumIncome = 0.0;
        double sumExpenses = 0.0;
        Map<String, Double> expensesMap = new TreeMap<>();
        String company;
        //List<Line> beans = new CsvToBeanBuilder(new FileReader(movementList)).withType(Line.class).build().parse();
        List<Line> beans = new CsvToBeanBuilder(new CSVReader(
                new InputStreamReader(new FileInputStream(movementList), "UTF-8")))
                .withType(Line.class).build().parse();
        for(Line bean : beans){
            if(bean.getExpense().contains(",")){
                String money = bean.getExpense().replace(",", ".");
                bean.setExpense(money);
            }

            double expense = Double.parseDouble(bean.getExpense());
            double income = Double.parseDouble(bean.getReceipt());
            double variable = 0.0;

            if(expense > 0){
                int index1 = bean.getTransactionDescription().indexOf("\\");
                int index2 = bean.getTransactionDescription().indexOf("       ");
                company = bean.getTransactionDescription().substring(index1 + 1, index2).trim();
                if(!expensesMap.containsKey(company)){
                    expensesMap.put(company, 0.0);
                }
                variable = expensesMap.get(company) + expense;
                expensesMap.put(company, variable);
            }
            sumExpenses += expense;
            sumIncome += income;
        }

        System.out.println("Сумма расходов: " + sumExpenses);
        System.out.println("Сумма доходов: " + sumIncome);
        System.out.println("Сумма расходов по организациям:");
        for(String x : expensesMap.keySet()){
            System.out.println(x + " -> " + expensesMap.get(x) + " руб.");
        }
    }
}
