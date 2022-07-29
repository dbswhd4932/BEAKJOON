package BAEKJOON.Silver.Ⅳ;

import java.util.Scanner;

public class NO1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        // 110 -> 99
        // 210 -> 105
        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                answer++;
            }
            else {
                String[] s = String.valueOf(i).split("");
                if(Integer.parseInt(s[2]) - Integer.parseInt(s[1])
                        == Integer.parseInt(s[1]) - Integer.parseInt(s[0])) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
