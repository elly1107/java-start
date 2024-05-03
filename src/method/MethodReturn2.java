package method;

import java.sql.PreparedStatement;

public class MethodReturn2 {
    public static void main(String[] args){
        age(18);
        age(1);
    }

    public static void age(int i){
        if(i<18){
            System.out.println(i+ ": 미성년자 출입 불가");
            return;
        }
            System.out.println(i+ ": 출입 가능");
    }
}
