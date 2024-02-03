package variable.ex;

public class GradeEx1 {
    public static void main(String[] args) {
        String grade;
        String congrat;

        int score = 59;

        if (score >=90){
            grade = "A";
            congrat = "매우 축하";
        } else if (score >=80){
            grade = "B";
            congrat = "축하";
        } else if (score >=70){
            grade = "C";
            congrat = "축";
        } else if (score >=60){
            grade = "D";
            congrat = "ㅊㅊ";
        } else {
            grade = "F";
            congrat = "ㅊ";
        }

        System.out.println(grade + " : " + congrat);
    }
}
