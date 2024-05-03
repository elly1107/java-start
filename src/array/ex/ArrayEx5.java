package array.ex;

import java.util.Scanner;
public class ArrayEx5 {
    public static void main (String[] args){
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        System.out.println(number+"개의 정수를 입력하세요:");

        int sum=0;
        int[] arr = new int[number];
        for (int i=0; i<number;i++){
              arr[i]=scanner.nextInt();
              sum+=arr[i];
        }

        double average=(double)sum/number;

        System.out.println("입력한 정수의 합계 "+sum);
        System.out.println("입력한 정수의 평균 "+average);
    }
}
