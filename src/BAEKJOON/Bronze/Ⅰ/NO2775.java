package BAEKJOON.Bronze.Ⅰ;

import java.util.Scanner;

public class NO2775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int [][] arr = new int[15][15];

        for (int l = 0; l < t; l++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 1; i <= 14; i++) {
                arr[i][1] = 1; // 모든 층의 1호는 모두 1
            }

            for (int i = 1; i <= 14; i++) {
                arr[0][i] = i; // 0층 i호는 모두 i 명
            }

            for (int i = 1; i <= 14; i++) { //층
                for (int j = 2; j <= 14; j++) { //호수
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
            System.out.println(arr[k][n]);
        }
    }
}
