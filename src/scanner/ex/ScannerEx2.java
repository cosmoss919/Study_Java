//문제 - 홀수 짝수
//사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.

package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int number = scanner.nextInt();

        System.out.println("입력하신 숫자는 " + (number % 2 == 0 ? "짝수" : "홀수") +"입니다.");
    }
}
