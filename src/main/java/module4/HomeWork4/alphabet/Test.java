package module4.HomeWork4.alphabet;

public class Test {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < alphabet.length(); i++){
            int code = alphabet.charAt(i);
            System.out.println(alphabet.charAt(i) + " : " + code);
        }
    }
}
