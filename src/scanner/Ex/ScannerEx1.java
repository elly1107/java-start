package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("당신의 이름을 입력하세요:");
            String input1 = scanner.nextLine();

            System.out.print("당신의 나이를 입력하세요:");
            int input2 = scanner.nextInt();

            System.out.println("당신의 이름은 " + input1 + "이고, 나이는 " + input2 + "살 입니다.");
    }
}
