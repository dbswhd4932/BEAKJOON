package BAEKJOON.Silver.Ⅲ;

import java.util.Scanner;

public class NO15650 {

    static int[] arr;
    static int n;
    static int m;

    public static void dfs(int a, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = a; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        dfs(1,0);


    }
}
