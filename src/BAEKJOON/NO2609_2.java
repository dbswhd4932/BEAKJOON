package BAEKJOON;

import java.util.Scanner;

public class NO2609_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;

        if (a >= b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }

        if (b > a) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
        // 최소공배수
        System.out.println(a * b / gcd);

    }
}
