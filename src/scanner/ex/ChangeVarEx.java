//문제 - 변수 값 교환
//변수 a=10 이 들어있고, b=20 이 들어있다.
//변수 a의 값과 변수 b의 값을 서로 바꾸어라
//다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
//힌트: temp 변수를 활용해야 한다.

package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int b = scanner.nextInt();

        if(a != b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = " + a +" , b = "+ b);
    }
}