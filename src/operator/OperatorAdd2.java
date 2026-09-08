package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // a=2, b=2
        b=++a;
        System.out.println("a = " + a + ", b = " + b);


        // a=2, b=1
        a=1;
        b=0;
        b=a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
