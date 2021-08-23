package module6.HomeWork4;

import java.util.Random;

public class Manager implements Employee{
    private int monthSalary;
    private Random random;

    public Manager(Company company){
        random = new Random();
        monthSalary = company.getManagerMonthSalary() + ((random.nextInt(25000) + 115000)/20);
        //company.hire(this);
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }
}
