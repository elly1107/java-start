package scanner.Ex;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args){
        int total=0;
        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            Scanner scanner=new Scanner(System.in);
            int option=scanner.nextInt();
            if(option==1){
                scanner.nextLine(); //nextInt()에서 숫자만 가져가고 /n은 남겨놔서, /n이 입력되어 다음 nextLine()이 끝나서 실제 입력을 못받음.
                System.out.print("상품명을 입력하세요: ");
                String name=scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price=scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int number=scanner.nextInt();
                int sum = price*number;
                System.out.println("상품명:"+name+" 가격:"+price+" 수량:"+number+" 합계:"+sum);
                total+=sum;
            }
            else if (option==2){
                System.out.println("총 비용: "+total);
                total=0;
            }
            else if (option==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
    