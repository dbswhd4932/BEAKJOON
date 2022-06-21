package BAEKJOON;

import java.util.Scanner;

public class NO2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //반복케이스 T
        int T = sc.nextInt();
        // 반복횟수
        int R = 0;
        // 문자 S
        String S = "";

        for (int i = 0; i < T; i++) {
            R = sc.nextInt();
            S = sc.next();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
