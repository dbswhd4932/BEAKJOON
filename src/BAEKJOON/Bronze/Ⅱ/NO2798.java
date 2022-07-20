package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO2798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //카드개수
        int m = sc.nextInt(); //블랙잭 값

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0; //세수의 합
        int tmp = 0; //비교할 수(답)

        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (tmp < sum && sum <= m)
                        tmp = sum;
                }
            }
        }
        System.out.println(tmp);

    }
}
