public class Main {
    public static void main(String[] args) {
        Person joe = new Student("Joe", 2);
        joe.walk();
        Person high = new HighSchooler("Joe", 2, "Clarksburg");
        high.walk();
    }
}
