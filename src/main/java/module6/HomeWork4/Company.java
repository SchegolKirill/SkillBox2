package module6.HomeWork4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private int operatorMonthSalary; int managerMonthSalary; int topManagerMonthSalary;
    private int income;
    static List<Employee> employees ;


    public Company(int income, int operatorMonthSalary, int managerMonthSalary, int topManagerMonthSalary){
        this.income = income;
        employees = new ArrayList<>();
        this.operatorMonthSalary = operatorMonthSalary;
        this.managerMonthSalary = managerMonthSalary;
        this.topManagerMonthSalary = topManagerMonthSalary;
    }

    public int getOperatorMonthSalary() {
        return operatorMonthSalary;
    }

    public int getManagerMonthSalary() {
        return managerMonthSalary;
    }

    public int getTopManagerMonthSalary() {
        return topManagerMonthSalary;
    }

    public int getIncome(){
        return income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void hire(Employee employee){
        this.employees.add(employee);
    }

    public void hireAll(List<Employee> employees){
        this.employees.addAll(employees);
    }

    public void fire(Employee employee){
        this.employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count){
        List<Employee> topSalaryStaff = new ArrayList<>();
        Collections.sort(employees, new TopSalaryComparator());
        for(int i = 0; i < count; i++){
            topSalaryStaff.add(employees.get(i));
        }
        return topSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count){
        List<Employee> lowestSalaryStaff = new ArrayList<>();
        Collections.sort(employees, new LowestSalaryComparator());
        for(int i = 0; i < count; i++){
            lowestSalaryStaff.add(employees.get(i));
        }
        return lowestSalaryStaff;
    }
}
