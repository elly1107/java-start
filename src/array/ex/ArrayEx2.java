package array.ex;

import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args){
         System.out.println("5개의 정수를 입력하세요: ");
         Scanner scanner = new Scanner(System.in);

         int[] arr = new int[5];
         for(int i=0; i<arr.length; i++) {
             arr[i] = scanner.nextInt();
         }

         for (int j=0; j<arr.length; j++){
             System.out.print(arr[j]);
             if(j<arr.length-1){
                 System.out.print(", ");
             }
         }
    }
}
