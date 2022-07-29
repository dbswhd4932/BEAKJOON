package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO2231 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 216

        int num = n;
        int answer = 0;

        while (num > 0) {
            num--;
            int sum = num;
            int unit = num;

            while (unit != 0) {
                sum += unit % 10;
                unit = unit / 10;
            }
            if (sum == n) {
                answer = num;
            }
        }
        System.out.println(answer);
    }
}
