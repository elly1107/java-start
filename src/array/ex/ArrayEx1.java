package array.ex;

public class ArrayEx1 {
    public static void main(String[] args){
        int[] arr=new int[5];
        arr[0]=90;
        for(int i=1; i<arr.length;i++){
            arr[i]=arr[i-1]-10;
        }

        int total=0 ;
        for(int number:arr){
            total+=number;
        }

        double average=(double) total/arr.length;
        System.out.println("점수 총합: "+total);
        System.out.println("점수 평균: "+average);
    }
}
