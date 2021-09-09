package module9.VTBhomework1;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(1);
        Wall wall3 = new Wall(1);
        Wall wall4 = new Wall(2);
        Wall wall5 = new Wall(2);
        Wall wall6 = new Wall(1000000);
        Wall wall7 = new Wall(4);

        Road road1 = new Road(15);
        Road road2 = new Road(20);
        Road road3 = new Road(10);
        Road road4 = new Road(33);
        Road road5 = new Road(39);
        Road road6 = new Road(1000000);

        Cat cat1 = new Cat(40,3);
        Human human1 = new Human(200, 2);
        Robot robot1 = new Robot(10000,10000);

        Obstacle[] obstacles = new Obstacle[] {
            wall1, road1, wall2, road2, wall3, road3, wall4, road4, wall5, road5, wall6, road6, wall7};

        Movement[] bodies = new Movement[] {cat1, human1, robot1};

        for(Movement body : bodies){
            System.out.println("Полосу препятствия преодолевает: " + body.getName());
            for(int i = 0; i < obstacles.length; i++ ){
                if(obstacles[i].action(body)){
                    continue;
                }
                else{
                    System.out.println(body.getName() + " провалился на препятствии № " + (i+1));
                    break;
                }
            }
        }
    }
}
