package BAEKJOON.Bronze.Ⅰ;

import java.util.Scanner;

public class NO1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int line = 0; // 어느번째 라인에 있는지 확인
        int cnt = 0;  // 해당 라인의 마지막 수 확인
        int top = 0;  // 분자값
        int bottom = 0; // 분모값

        while (cnt <= n) { // 마지막의 수가 n 보다는 작아야 한다.
            line++;       // 라인수 + 1
            cnt = line * (line + 1) / 2; // 1,3,6,10 ... 배열의 마지막 수 구하기
        }

        if (line % 2 != 0) { // 홀수일때
            top = 1 + cnt - n;
            bottom = line + n - cnt;
        } else {            // 짝수일때
            bottom = 1 + cnt - n;
            top = line + n - cnt;
        }
        System.out.println(top + "/" + bottom);
    }
}
