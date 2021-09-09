package module9.VTBhomework1;

public class Cat implements Movement{

    private int run;
    private int jump;
    private String name;

    public Cat(int run, int jump){
        this.run = run;
        this.jump = jump;
        name = "Кошка";
    }

    @Override
    public void letRun() {
        System.out.println("Кошка пробежала " + run + " метров");
    }

    @Override
    public void letJump() {
        System.out.println("Кошка прыгнула " + jump + " метра");
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    @Override
    public String getName() {
        return name;
    }


}
