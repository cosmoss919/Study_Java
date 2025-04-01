package array.ex;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

        // 위의 코드를 개선하기

        int[] students = {90, 80, 70, 60, 50};
        //total = Arrays.stream(students).sum();  //이거는 안배운거니까...

        total = 0;  // 위의 결과 한번 초기화
        for (int student : students) {
            total += student;
        }

        average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}