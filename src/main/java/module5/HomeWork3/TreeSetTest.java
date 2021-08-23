package module5.HomeWork3;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeSetTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern p1 = Pattern.compile("^ADD|^LIST");
        Matcher m1 = p1.matcher(text);

        Pattern p2 = Pattern.compile("((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+(\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)$");
        Matcher m2 = p2.matcher(text);

        TreeSet<String> emailSet = new TreeSet<>();
        emailSet.add("qwerty@mail.com");

        while (m1.find()){
            if(text.substring(m1.start(), m1.end()).equals("LIST")){
                for(String email : emailSet){
                    System.out.println(email);
                }
            }else if(text.substring(m1.start(), m1.end()).equals("ADD")){
                while(m2.find()){
                    emailSet.add(text.substring(m2.start(), m2.end()));
                }
            }
        }
    }
}
