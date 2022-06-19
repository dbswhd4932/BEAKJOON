package BAEKJOON;

import java.util.Scanner;

public class NO10093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if(b > a) {
            System.out.println(b - a - 1);
            for (long i = a + 1; i < b; i++) {
                if (i != b - 1) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }

        if(a > b) {
            System.out.println(a - b - 1);
            for (long i = b + 1; i < a; i++) {
                if (i != a - 1) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }

        if(a==b) {
            System.out.println(0);
        }
    }
}
