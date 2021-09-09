package module9.VTBhomework1;

public class Human implements Movement{

    private int run;
    private int jump;
    private String name;

    public Human(int run, int jump){
        this.run = run;
        this.jump = jump;
        name = "Человек";
    }

    @Override
    public void letRun() {
        System.out.println("Человек пробежал " + run + " метров");;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    @Override
    public void letJump() {
        System.out.println("Человек прыгнул " + jump + " метра");
    }

    public String getName() {
        return name;
    }
}
