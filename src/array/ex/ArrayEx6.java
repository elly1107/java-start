package array.ex;

import java.util.Scanner;
public class ArrayEx6 {
    public static void main(String[] args){
         System.out.print("입력받을 숫자의 개수를 입력하세요: ");
         Scanner scanner=new Scanner(System.in);
         int input=scanner.nextInt();
         System.out.println(input+"개의 정수를 입력하세요:");

         int[] arr=new int[input];
         for(int i=0; i<input; i++){
             arr[i]=scanner.nextInt();
         }

        int min=arr[0];
        int max=arr[0];

         for(int j=0; j<input; j++){
             if(max<arr[j]){
                 max=arr[j];
             }
             if(min>arr[j]){
                 min=arr[j];
             }
         }



         System.out.println("가장 작은 정수: "+min);
         System.out.println("가장 큰 정수: "+max);

    }
}
