package BAEKJOON;

import java.util.Scanner;

public class NO11050 {

    public static int factorial(int a ) {
        if( a == 1) {
            return 1;
        }
        return a * factorial(a-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = factorial(a) / (factorial(b) * factorial(a-b));
        System.out.println(answer);

    }
}
