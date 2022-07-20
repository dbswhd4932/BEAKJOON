package BAEKJOON.Bronze.Ⅰ;

import java.util.Scanner;

public class NO1934 {

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int gcd = gcd(num1, num2);
            System.out.println(num1 * num2 / gcd);

        }
    }
}
