package BAEKJOON.Silver.Ⅲ;

import java.util.Scanner;

public class NO15649_2 {
    // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
    //첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
    static int n;
    static int m;
    static int[] list;
    static int[] check;

    public static void DFS(int cnt) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (check[i] == 1) {
                continue;
            }

            check[i] = 1;
            list[cnt] = i;
            DFS(cnt + 1);
            check[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        check = new int[n + 1];
        list = new int[n + 1];

        DFS(0);

    }

}
