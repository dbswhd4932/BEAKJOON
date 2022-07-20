package BAEKJOON.Bronze.Ⅰ;

import java.util.ArrayList;
import java.util.Scanner;

public class NO4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 각 점수를 담기위한 list
            ArrayList<Integer> list = new ArrayList<>();

            int cnt = sc.nextInt(); // 점수의 개수를 입력
            double sum = 0;  // 합계
            double avg = 0;  // 평균
            double count = 0;   // 평균 이상의 점수를 세기 위한 변수

            for (int j = 0; j < cnt; j++) { // 점수 입력
                list.add(sc.nextInt());
            }

            for (int score : list) { // 합계구하기
                sum += score;
            }

            avg = sum / cnt; // 평균구하기
            for (int scoreCompare : list) { // 평균보다 높은 점수를 구해서 count++ 한다
                if (avg < scoreCompare) {
                    count++;
                }
            }
            // 출력
            System.out.printf("%.3f%%\n", count / cnt * 100);

        }
    }
}
