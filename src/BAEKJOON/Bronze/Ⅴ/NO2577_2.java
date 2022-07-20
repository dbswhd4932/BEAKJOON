package BAEKJOON.Bronze.Ⅴ;

import java.util.Scanner;

public class NO2577_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String multi = String.valueOf(a*b*c);

        char [] cArr = multi.toCharArray();
        int[] arr = new int [10];
        for (int i = 0; i < cArr.length; i++) {
            int idx = cArr[i] -'0';
            arr[idx]++;
        }

        for (int c1 : arr) {
            System.out.println(c1);
        }

    }
}
