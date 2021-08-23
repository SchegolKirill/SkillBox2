package module9.homework3;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static String movementList = "data/movementList.csv";
    public static void main(String[] args) throws Exception{
        CSVReader reader = new CSVReader(new FileReader(movementList), ',' , '"' , 1);

        String[] nextLine;
        double sumIncome = 0.0;
        double sumExpenses = 0.0;
        while ((nextLine = reader.readNext()) != null) {
            if(nextLine[7].contains(",")){
                String money = nextLine[7].replace(",", ".");
                nextLine[7] = money;
            }
//            if (nextLine != null) {
//                //Verifying the read data here
//                System.out.println(Arrays.toString(nextLine));
//            }
            //System.out.println(nextLine[7]);
            double expense = Double.parseDouble(nextLine[7]);
            sumExpenses += expense;
            double income = Double.parseDouble(nextLine[6]);
            sumIncome += income;
        }
        System.out.println("Сумма расходов: " + sumExpenses);
        System.out.println("Сумма доходов: " + sumIncome);
    }
}
