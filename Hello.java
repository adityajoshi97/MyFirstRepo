public class Hello {

    private int num = 10;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hello hello = new Hello();
        hello.showNum();
    }

    public void showNum() {
        System.out.println("Number : " + num);
    }

}