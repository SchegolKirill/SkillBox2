package module4.HomeWork4.startask;

import java.util.Scanner;
//Номер кредитной карты <4008 1234 5678> 8912
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String safe = searchAndReplaceDiamonds(text, "***");
        System.out.println(safe);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder){
        String newText = text.substring(0, text.indexOf('<')) + placeholder + text.substring(text.indexOf('>') + 1);
        return newText;
    }
}
