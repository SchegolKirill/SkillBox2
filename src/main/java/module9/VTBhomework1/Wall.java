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
    public boolean action(Movement body){
        if(body.getJump() > height){
            System.out.println("Успешный прыжок");
            return true;
        }
        System.out.println("Неудачный прыжок");
        return false;
    }
}
