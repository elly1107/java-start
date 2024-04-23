package scanner.Ex;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요: ");
            String str = input.nextLine();

            if (str.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("나이를 입력하세요: ");//10\n
            int age = input.nextInt(); //10
            input.nextLine(); //\n

            System.out.println("입력한 이름: " + str + ", 나이: " + age);

        }
    }
}
