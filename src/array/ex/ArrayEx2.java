//문제 - 배열의 입력과 출력
//사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
//출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
//실행 결과 예시를 참고하자.

package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("5개의 정수를 입력해 주세요 : ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if(i != numbers.length - 1) System.out.print(", ");
        }
    }
}
