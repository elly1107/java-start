package scanner.Ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요:");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int b = scanner.nextInt();

        if(a>b){
            int temp=b;
            b=a;
            a=temp;
        }

        for(int i=a; i<=b; i++){
            System.out.print(i);
            if(i!=b) {
                System.out.print(",");
            }
        }
    }
}
