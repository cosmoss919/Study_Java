package loop.ex;

//문제: 누적 합 계산
//반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요. 이때, sum 이라는 변수를 사용하여 누적
//합을 표현하고, i 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.
//while문, for문 2가지 버전의 정답을 만들어야 합니다.
public class ForWhileEx3 {

    public static void main(String[] args) {
        int max = 10;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        System.out.println(sum);

        sum = 0;

        int count = 0;
        while (count <= max) {
            sum += count;
            count++;
        }

        System.out.println(sum);
    }
}
