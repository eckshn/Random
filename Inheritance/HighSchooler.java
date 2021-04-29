public class HighSchooler extends Student {
    private String school;

    public HighSchooler(String name, int id, String school) {
        super(name, id);
        this.school = school;
    }

    public void walk(int period) {
        System.out.println("Walking to " + period + " at " + school + "...");
    }

    public void walk() {
        System.out.println("Walking to " + school + "...");
    }

}
