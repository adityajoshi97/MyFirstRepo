public class Hello {

    private int num = 10;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hello hello = new Hello();
        hello.showNum(30);
    }

    public void showNum(int number) {
        System.out.println("Number : " + num*number);
    }

}