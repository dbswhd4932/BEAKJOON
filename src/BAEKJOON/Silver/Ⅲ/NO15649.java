package BAEKJOON.Silver.Ⅲ;

import java.util.Scanner;

public class NO15649 {
    // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
    //첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
    static int [] arr;
    static boolean [] visit;

    public static void dfs(int n , int m , int depth) {
        if( depth == m ) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1);
                visit[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        visit = new boolean[n];

        dfs(n,m,0);

    }
}
