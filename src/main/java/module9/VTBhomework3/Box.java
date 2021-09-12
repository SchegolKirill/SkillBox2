package module9.VTBhomework3;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruitBox = new ArrayList<>();
    private float weightBox;

    public Box(){

    }

    public ArrayList<Fruit> getFruitBox(){
        return fruitBox;
    }
    public float getWeightBox(){
        for(Fruit fruit : fruitBox){
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box b1, Box b2){
        return b1.getWeightBox() == b2.getWeightBox();
    }

    public void changeFruits(Box b){
        if(!this.fruitBox.isEmpty() && !b.getFruitBox().isEmpty()
                && this.fruitBox.get(0).getClass() != b.getFruitBox().get(0).getClass()){
            System.out.println("Нельзя смешивать фрукты");
        }else{
            this.fruitBox.addAll(b.getFruitBox());
            b.getFruitBox().removeAll(b.getFruitBox());
        }
    }

    public void addFruit(Object fruit){
        if(!this.fruitBox.isEmpty() && this.fruitBox.get(0).getClass() != fruit.getClass()) {
            System.out.println("Нельзя смешивать фрукты");
        }else{
            this.fruitBox.add((Fruit)fruit);
        }
    }
}
