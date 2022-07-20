package BAEKJOON.Bronze.Ⅴ;

import java.util.Scanner;

public class NO15964 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long answer = 0;

        answer = (a+b) * (a-b);
        System.out.println(answer);

    }
}
