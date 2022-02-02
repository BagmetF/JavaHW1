package Lesson6HW.Animals;


public abstract class Pets {

    protected String name;
    protected int runRange;
    protected int swimRange;

    public Pets(int runRange, String name, int swimRange) {
        this.name = name;
        this.runRange = runRange;
        this.swimRange = swimRange;
    }

    public void runDistance(int runDistance) {
        if (runRange >= runDistance) {
            runRange -= runDistance;
            System.out.println(name + " пробежал " + runDistance);
        } else {
            System.out.println(name + " не смог пробежать " + runDistance);
        }
    }

    public void swimDistance(int swimDistance) {
        if (swimRange >= swimDistance) {
            swimRange -= swimDistance;
            System.out.println(name + " проплыл " + swimDistance);
        }
        if (swimRange == 0) {
           System.out.println(name + " не умеет плавать");
        }
    }
}


