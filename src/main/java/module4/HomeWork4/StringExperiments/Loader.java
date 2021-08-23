package module4.HomeWork4.StringExperiments;

import java.awt.*;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int fiveIndex = text.indexOf('5');
        int sevenIndex = text.indexOf('7');
        int threeIndex = text.lastIndexOf('3');

        System.out.println(fiveIndex);
        System.out.println(sevenIndex);
        System.out.println(threeIndex);

        String firstMoney = text.substring(fiveIndex, fiveIndex + 4);
        String secondMoney = text.substring(sevenIndex, sevenIndex + 4);
        String thirdMoney = text.substring(threeIndex, threeIndex + 5);

        System.out.println(firstMoney);
        System.out.println(secondMoney);
        System.out.println(thirdMoney);

        int vasyaMoney = Integer.parseInt(firstMoney);
        int petyaMoney = Integer.parseInt(secondMoney);
        int mashaMoney = Integer.parseInt(thirdMoney);
        int allMoney = vasyaMoney + petyaMoney + mashaMoney;

        System.out.println(allMoney);
    }
}