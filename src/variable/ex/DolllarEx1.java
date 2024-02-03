package variable.ex;

public class DolllarEx1 {
    public static void main(String[] args) {
        int dollar=10;

        if (dollar <0){
            System.out.println("잘못");
        } else if (dollar == 0){
            System.out.println("0");
        } else{
            System.out.println("환전 금액: " + dollar*1300);
        }
    }
}
