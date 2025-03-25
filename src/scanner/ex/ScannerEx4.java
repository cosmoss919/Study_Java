// 문제 - 구구단 출력
// 사용자로부터 하나의 정수 n을 입력 받고, 입력받은 정수 n의 구구단을 출력하는 프로그램을 작성하세요.

package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " X " + i + " = " + num * i);

        }
    }
}
