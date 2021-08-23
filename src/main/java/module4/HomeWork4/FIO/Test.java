package module4.HomeWork4.FIO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int firstSpaceIndex = text.indexOf(' ');
        int secondSpaceIndex = text.lastIndexOf(' ');
        String surname = text.substring(0, firstSpaceIndex);
        String name = text.substring(firstSpaceIndex + 1, secondSpaceIndex);
        String patronymic = text.substring(secondSpaceIndex + 1);
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }
}
