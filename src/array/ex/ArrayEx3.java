package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("5개의 정수를 입력하세요:");
         int[] arr = new int[5];

         for(int i=0; i<arr.length; i++){
             arr[i]=scanner.nextInt();
         }

         System.out.println("입력한 정수를 역순으로 출력");

         for(int j=arr.length-1; j>=0; j--){
            System.out.print(arr[j]);
            if(j>0){
                System.out.print(", ");
            }
         }




    }
}
