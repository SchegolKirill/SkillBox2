package module5.HomeWork1.Rainbow;

public class Test {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colorWords = text.split(",?\\s+");
        String temp = "";
        for (int i = 0; i < colorWords.length / 2; i++){
            temp = colorWords[i];
            colorWords[i] = colorWords[colorWords.length - i - 1];
            colorWords[colorWords.length - i - 1] = temp;
        }
        for(String word : colorWords){
            System.out.println(word);
        }
    }
}
