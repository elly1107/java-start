package method.ex;

public class MethodEx1Ref{
    public static void main(String[] args){
        result(1,2,3);

        result(15,25,35);
    }

    public static void result(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("평균값: "+ sum/3.0);
    }
}
