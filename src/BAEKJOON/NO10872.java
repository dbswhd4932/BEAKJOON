package BAEKJOON;

import java.util.Scanner;

public class NO10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }

    // 재귀 - 팩토리얼 구현
    static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
