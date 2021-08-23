package module6.HomeWork4;

public class Operator implements Employee{

    private int monthSalary;

    public Operator(Company company){
        monthSalary = company.getOperatorMonthSalary();
        //company.hire(this);
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }
}
