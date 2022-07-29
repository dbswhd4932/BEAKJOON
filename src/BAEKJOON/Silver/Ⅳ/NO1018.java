package BAEKJOON.Silver.Ⅳ;

import java.util.Scanner;

public class NO1018 {

    static int n;
    static int m;
    static int [][] board = new int [n][m];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }


    }
}
