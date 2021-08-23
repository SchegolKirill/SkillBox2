package module4.HomeWork5.phone;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String phoneNumber = number.replaceAll("[^0-9]", "");

        if(phoneNumber.length() == 10 || phoneNumber.length() == 11){
            if(phoneNumber.length() == 10){
                 System.out.println(7 + phoneNumber);
            }else {
                 if (phoneNumber.charAt(0) == '7'){
                     System.out.println(phoneNumber);
                 }
                 else if (phoneNumber.charAt(0) == '8'){
                     System.out.println("7" + phoneNumber.substring(1));
                 }
                 else{
                     System.out.println("Неверный формат номера");
                 }
            }
            }else{
                System.out.println("Неверный формат номера");
         }
    }
}
