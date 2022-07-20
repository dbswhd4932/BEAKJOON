package BAEKJOON.Bronze.Ⅲ;

import java.util.Scanner;

public class NO1085 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int width = ( w - x ) < x ? ( w - x) : x;
        int height = ( h - y ) < y ? ( h - y ) : y;

        int answer = width < height ? width : height;
        System.out.println(answer);
    }
}
