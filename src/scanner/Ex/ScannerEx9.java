package scanner.Ex;

import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        int sum=0;
        int count=0;
        int a =0;
            /*
        while(true){
            a = input.nextInt();
            if(a==-1){
                break;
            }
            sum+=a;
            count++;
        }

        */
        while((a=input.nextInt()) != -1){
            sum+=a;
            count++;
        }


        double average=(double) sum/count;
        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+average);
    }
}
