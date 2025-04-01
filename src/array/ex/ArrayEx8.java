//Ex7에서 학생수를 입력받도록 개선하자

package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int studentCount = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int sum = 0;
            for (int score : scores[i]) {
                sum += score;
            }

            System.out.println(i+1 +"번 학생의 총점 :" + sum + ", 평균: " + (double) sum / 3);
        }
    }
}
