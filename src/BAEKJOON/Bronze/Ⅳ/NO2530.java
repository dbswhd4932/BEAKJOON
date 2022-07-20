package BAEKJOON.Bronze.Ⅳ;

import java.util.Scanner;

public class NO2530 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        int t = sc.nextInt();

        m += t / 60;
        s += t % 60;

        m += s / 60;
        s = s % 60;

        h += m / 60;
        m = m % 60;

        h = h % 24;

        System.out.println(h + " " + m + " " + s);

    }
}
