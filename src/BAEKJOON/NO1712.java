package BAEKJOON;

import java.util.Scanner;

public class NO1712 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int answer = 0;

        if (B > C) {
            answer = -1;
        } else {
            answer = A / (C - B) + 1;
        }
        System.out.println(answer);
    }
}
