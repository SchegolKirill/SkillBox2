package module6.HomeWork4;
import module6.HomeWork4.Company;

public class TopManager implements Employee{
    private int monthSalary;

    public TopManager(Company company){
        if(company.getIncome() > 10000000){
            monthSalary = company.getTopManagerMonthSalary() + (int) (company.getManagerMonthSalary() * 1.5);
        }else {
            monthSalary = company.getTopManagerMonthSalary();
        }
        //company.hire(this);
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }
}
