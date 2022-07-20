package BAEKJOON.Silver.Ⅴ;

import java.util.Scanner;

public class NO1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 원하는 길이
        int count = 0; // 붙이는 횟수

        int stick = 64; // 초기값

        while (x > 0) {
            if (stick > x) {
                stick = stick / 2;
            } else {
                count++;
                x = x - stick;
            }
        }
        System.out.println(count);
    }
}
