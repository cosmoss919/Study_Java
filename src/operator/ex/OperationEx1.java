//1. num1, num2, num3 라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화하세요.
//2. 세 변수의 합을 계산하고, 그 결과를 sum 이라는 이름의 int 변수에 저장하세요.
//3. 세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 int 변수에 저장하세요. 평균 계산 시 소수점 이하의 결과는 버림하세요.
//4. sum과 average 변수의 값을 출력하세요.

package operator.ex;

public class OperationEx1 {

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average);
    }
}
