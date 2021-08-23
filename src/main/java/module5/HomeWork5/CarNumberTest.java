package module5.HomeWork5;

import java.util.*;
import java.util.stream.IntStream;

public class CarNumberTest {
    public static void main(String[] args) {
        String[] letters = new String[]{"А", "В","Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> carNumbers = new ArrayList<>();

        for(int i = 0; i < letters.length; i++){
            for (int j = 111; j <= 999; j = j + 111){
                for(int k = 1; k <= 197; k++){
                    String region = "";
                    if(k < 10){
                        region = "0" + String.valueOf(k);
                    }else{
                        region = String.valueOf(k);
                    }
                    String number11 = String.format("%s%d%s%s%s", letters[i], j,
                            letters[i], letters[i], region);
                    carNumbers.add(number11);
                }
            }
        }

        HashSet<String> carNumberHashSet = new HashSet<>();
        carNumberHashSet.addAll(carNumbers);

        TreeSet<String> carNumberTreeSet = new TreeSet<>();
        carNumberTreeSet.addAll(carNumbers);

        Scanner scanner = new Scanner(System.in);

        for(;;){
            String number01 = scanner.nextLine();
            long start1 = System.nanoTime();
            System.out.println(carNumbers.contains(number01));
            long duration1 = System.nanoTime() - start1;
            if (carNumbers.contains(number01)){
                System.out.println("Поиск перебором: номер найден, поиск составил: " + duration1 + " нс");
            }else{
                System.out.println("Поиск перебором: номер не найден, поиск составил: " + duration1 + " нс");
            }

            long start2 = System.nanoTime();
            Collections.sort(carNumbers);
            int index = Collections.binarySearch(carNumbers, number01);
            System.out.println(index);
            long duration2 = System.nanoTime() - start2;
            if (Collections.binarySearch(carNumbers, number01) >= 0){
                System.out.println("Бинарный поиск: номер найден, поиск составил: " + duration2 + " нс");
            }else{
                System.out.println("Бинарный поиск: номер не найден, поиск составил: " + duration2 + " нс");
            }

            long start3 = System.nanoTime();
            System.out.println(carNumberHashSet.contains(number01));
            long duration3 = System.nanoTime() - start3;
            if (carNumberHashSet.contains(number01)){
                System.out.println("Поиск в HashSet: номер найден, поиск составил: " + duration3 + " нс");
            }else{
                System.out.println("Поиск в HashSet: номер не найден, поиск составил: " + duration3 + " нс");
            }

            long start4 = System.nanoTime();
            System.out.println(carNumberHashSet.contains(number01));
            long duration4 = System.nanoTime() - start4;
            if (carNumberTreeSet.contains(number01)){
                System.out.println("Поиск в TreeSet: номер найден, поиск составил: " + duration4 + " нс");
            }else{
                System.out.println("Поиск в TreeSet: номер не найден, поиск составил: " + duration4 + " нс");
            }
        }
    }
}
