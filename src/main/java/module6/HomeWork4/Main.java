package module6.HomeWork4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Company yandex = new Company(100000000, 40000, 100000,
                200000);

        for (int i = 0; i < 10; i++){
            yandex.hire(new TopManager(yandex));
        }
        for(int i = 0; i < 180; i++){
            yandex.hire(new Operator(yandex));
        }
        for(int i = 0; i < 80; i++){
            yandex.hire(new Manager(yandex));
        }

        //Проверяю кол-во сотрудников
        System.out.println("\n" + yandex.getEmployees().size() + "\n");

        //Дальше по заданию
        try{
            for(Employee employee : yandex.getTopSalaryStaff(15)){
                System.out.println(employee.getMonthSalary());
            }
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Некорректное значение count");
        }

        try{
            for(Employee employee : yandex.getLowestSalaryStaff(30)){
                System.out.println(employee.getMonthSalary());
            }
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Некорректное значение count");
        }

        //Удаляю 50% случайных сотрудников
        Random randomEmployee = new Random();
        int j = 0;
        final int EMPLOYEESCOUNT = yandex.getEmployees().size();

        while(j < (EMPLOYEESCOUNT/2)){
            yandex.fire(yandex.getEmployees().get(randomEmployee.nextInt(yandex.getEmployees().size())));
            j++;
        }

        //Снова проверяю кол-во сотрудников
        System.out.println("\n" + yandex.getEmployees().size() + "\n");

        //И дальше по заданию
        try{
            for(Employee employee : yandex.getTopSalaryStaff(15)){
                System.out.println(employee.getMonthSalary());
            }
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Некорректное значение count");
        }

        try{
            for(Employee employee : yandex.getLowestSalaryStaff(30)){
                System.out.println(employee.getMonthSalary());
            }
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Некорректное значение count");
        }
    }
}
