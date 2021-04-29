public class Student extends Person {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public void walk(int period) {
        System.out.println("Walking to " + period + "...");
    }

    public int getId() {
        return id;
    }
}
