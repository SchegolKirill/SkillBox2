package module5.HomeWork4;

import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, String> phoneList = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        for(;;){
            String textString = scanner.nextLine();

            Pattern p1 = Pattern.compile("[0-9]+");
            Matcher m1 = p1.matcher(textString);

            Pattern p2 = Pattern.compile("[а-яА-Я]+");
            Matcher m2 = p2.matcher(textString);

            if(textString.equals("LIST")){
                printMap(phoneList);
            }

            while (m1.find() || m2.find()) {
                if(m1.matches()){
                    if (phoneList.containsKey(textString.substring(m1.start(), m1.end()))) {
                        System.out.println(textString.substring(m1.start(), m1.end()) + " => "
                                + phoneList.get(textString.substring(m1.start(), m1.end())));
                    }else{
                        System.out.println("Номер телефона не найден, введите имя");
                        String name = scanner.nextLine();
                        phoneList.put(textString, name);
                    }
                }if(m2.matches()){
                    if(phoneList.containsValue(textString.substring(m2.start(), m2.end()))){
                        for(Map.Entry<String, String> item : phoneList.entrySet()){
                            if(item.getValue().equals(textString.substring(m2.start(), m2.end()))){
                                System.out.println(item.getKey() + " => " + item.getValue());
                            }
                        }
                    }else{
                        System.out.println("Имя не найдено, введите номер телефона");
                        String number = scanner.nextLine();
                        phoneList.put(number, textString);
                    }
                }
            }
        }
    }

    private static void printMap(Map<String, String> map){
        map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue())
                .forEach(s-> System.out.println(s.getKey() + " => " + s.getValue()));
    }
}
