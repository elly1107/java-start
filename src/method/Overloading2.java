package method;

public class Overloading2 {
    public static void main(String[] args){
        myNumber(1,1.2);
        myNumber(1.2,2);

    }

    public static void myNumber(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myNumber(double a, int b){
        System.out.println("double a, int b");
    }
}
