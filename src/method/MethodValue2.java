package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. ChangeNumber 호출 전 num1: " + num1);
        int num2 = changeNumber(num1);
        System.out.println("2. ChangeNumber 호출 후 num2: "+num2);
    }

    public static int changeNumber(int num2){
        num2=num2*2;
        return num2;
    }

}
