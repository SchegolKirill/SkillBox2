package module4.HomeWork1;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        Integer number1 = 12345;
        Integer number2 = 10;
        Integer number3 = 5059191;
        System.out.println(sumDigits(number1));
        System.out.println(sumDigits(number2));
        System.out.println(sumDigits(number3));
        Character character = 1234;
        System.out.println(character.charCount(22));
    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        String numberString = Integer.toString(number);
        int j = 0;
        for(int i = 0; i < numberString.length(); i++){
            j = j + Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return j;
    }

}
