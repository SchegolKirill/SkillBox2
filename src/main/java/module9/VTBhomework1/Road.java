package module9.VTBhomework1;

public class Road implements Obstacle {
    private int length;

    public Road(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }


    @Override
    public boolean action(Movement body){
        if(body.getRun() > length){
            System.out.println("Успешный забег");
            return true;
        }
        System.out.println("Неудачный забег");
        return false;
    }
}
