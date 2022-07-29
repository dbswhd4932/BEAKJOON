package BAEKJOON.Silver.Ⅴ;

import java.util.Scanner;

public class NO1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int num = 666;

        while (count < n) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            num++;
        }
        //마지막에 num++ 을 적용해서 -1 필요
        System.out.println(num - 1);
    }

}
