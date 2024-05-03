package array.ex;

import java.util.Scanner;
public class ArrayEx8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] subjects = new String[]{"국어", "영어", "수학"};

        System.out.println("학생 수를 입력하세요: ");
        int stnum=scanner.nextInt();
        int[][] scores = new int[stnum][subjects.length];

        for (int i=0; i<stnum; i++){
             System.out.println((i+1)+"번 학생의 성적을 입력하세요:");
             for(int j=0; j<subjects.length; j++) {
                 System.out.print(subjects[j] + " 점수:");
                 scores[i][j]=scanner.nextInt();
             }
        }

        for (int i=0; i<stnum; i++){
            int sum=0;
            for(int j=0; j<subjects.length; j++){
                sum+=scores[i][j];
            }
            System.out.println((i+1)+"번 학생의 총점: "+sum+", 평균: "+sum/subjects.length);
        }
    }
}
