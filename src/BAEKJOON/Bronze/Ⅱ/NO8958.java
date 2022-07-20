package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO8958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 점수 초기화
        int score = 0;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String s = sc.next();
            // char 형태 배열 선언
            char[] c = s.toCharArray();

            score = 0;
            // 'O' 연속 카운트 세기 위한 초기화
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                // [i] 가 'O' 이면 score 에 1씩 더해주고 count 도 1씩 더해준다
                if (c[j] == 'O') {
                    score++;
                    score = score + count;
                    count ++;
                // [i] 가 'X' 면 count 는 0으로 초기화
                } else if ( c[j] == 'X') {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
