package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args){
        int balance=10000;
        balance=deposit(balance, 1000);
        balance=withdraw(balance, 2000);
        System.out.println("최종 금액: "+ balance+"원");
    }

    public static int deposit(int balance, int deposit){
        balance +=deposit;
        System.out.println("입금: "+deposit+" 잔액: "+balance);
        return balance;
    }

    public static int withdraw(int balance, int withdraw){
        if(balance>=withdraw) {
            balance -= withdraw;
            System.out.println("출금: "+withdraw+" 잔액: "+balance);
            return balance;
        }else{
            System.out.println("잔액 부족");
            return balance;
        }
    }
}
