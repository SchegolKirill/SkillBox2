package module9.VTBhomework1;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public boolean action(Movement body){
        if((body.getJump() - height)>0){
            System.out.println("Успешный прыжок");
            return true;
        }
        System.out.println("Неудачный прыжок");
        return false;
    }
}
