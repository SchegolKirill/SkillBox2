package module9.VTBhomework1;

public class Robot implements Movement{

    private int run;
    private int jump;
    private String name;

    public Robot(int run, int jump){
        this.run = run;
        this.jump = jump;
        name = "Робот";
    }

    @Override
    public void letRun() {
        System.out.println("Робот пробежал " + run + " метров");;
    }

    @Override
    public void letJump() {
        System.out.println("Робот прыгнул " + jump + " метров");
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public String getName() {
        return name;
    }
}
