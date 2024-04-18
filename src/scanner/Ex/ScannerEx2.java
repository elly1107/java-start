package scanner.Ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        while(true) {
            System.out.print("하나의 정수를 입력하세요(0은 종료) : ");

            int number = scanner.nextInt();
            if(number==0){
                break;
            }else if ( number % 2 == 0 ) {
                System.out.println("입력한 정수 " + number + "은 짝수입니다.");
            } else{
                System.out.println("입력한 정수 " + number + "은 홀수입니다.");
            }
        }


    }
}
