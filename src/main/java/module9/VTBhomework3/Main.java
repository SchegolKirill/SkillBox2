package module9.VTBhomework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /////////////////////////Пункты 1 и 2///////////////////////////

        int[] a = {1,4};
        change(a);
        for (int number : a){
            System.out.println(number);
        }
        ArrayList<Integer> b = new ArrayList<>();
        changeType(a, b);
        for (int number : b){
            System.out.println(number);
        }

        ///////////////////////////Какая-то дичь с фруктами/////////////////////////////////

        Box appleBox = new Box();
        Box orangeBox = new Box();
        Box emptyBox = new Box();

        for(int i = 0; i < 10; i++){
//            appleBox.getFruitBox().add(new Apple());
//            orangeBox.getFruitBox().add(new Orange());
            appleBox.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }


        appleBox.changeFruits(orangeBox);
        for(Fruit fruit : appleBox.getFruitBox()){
            System.out.println(fruit);
        }
        System.out.println("\nПроверка на пустую коробку\n");
        emptyBox.changeFruits(orangeBox);
        for(Fruit fruit : emptyBox.getFruitBox()){
            System.out.println(fruit);
        }
    }

    public static void change(int[] a){
        int x = a[0];
        a[0] = a[1];
        a[1] = x;
    }

    public static void changeType(int[] a, ArrayList<Integer> b){
        for(int number : a){
            b.add(number);
        }
    }
}
