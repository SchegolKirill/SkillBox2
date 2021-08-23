package module6.HomeWork4;

import java.util.Comparator;

public class LowestSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getMonthSalary() > o2.getMonthSalary()){
            return 1;
        }
        if (o1.getMonthSalary() < o2.getMonthSalary()){
            return -1;
        }
        return 0;
    }
}
