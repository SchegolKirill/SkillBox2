package module9.VTBhomework4;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] someWords = {"краб", "кит", "зебра", "креветка", "рак", "пёс", "попугай", "бык", "тигр", "лев", "кит", "тигр"};
        TreeSet<String> words = new TreeSet<>();
        TreeMap<String, Integer> wordsMap = new TreeMap<>();

        for(String word : someWords){
            words.add(word);
            int x = 1;
            if(wordsMap.containsKey(word)){
                wordsMap.put(word, x++);
            }
            wordsMap.put(word, x);
        }

        for(String word : words){
            System.out.println(word);
        }
        for(Map.Entry<String, Integer> word : wordsMap.entrySet()){
            System.out.println(word.getKey() + " -> " + word.getValue());
        }
    }
}
