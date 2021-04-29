public class Calculator implements Behavior {

    @Override
    public void increase() {
        System.out.println("Increasing!!");
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

}
