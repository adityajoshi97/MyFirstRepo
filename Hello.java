public class Hello {

    private int num = 10;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hello hello = new Hello();
        hello.add(30);
    }

    public void add(int number) {
        System.out.println("Add : " + num + number);
    }

    public void multiply(int number) {
        System.out.println("Multiply : " + num * number);
    }

}