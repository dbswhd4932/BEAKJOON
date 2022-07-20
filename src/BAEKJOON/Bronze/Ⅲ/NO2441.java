package BAEKJOON.Bronze.Ⅲ;

import java.util.Scanner;

public class NO2441 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
