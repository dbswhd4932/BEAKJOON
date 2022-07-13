package BAEKJOON;

import java.util.Scanner;

public class NO2839_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0; // 봉지개수

        while (N != 0) {
            if (N % 5 == 0) {
                count += N / 5;
                break;
            } else {
                N = N - 3;
                count++;
            }
            if(N < 0 ) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
