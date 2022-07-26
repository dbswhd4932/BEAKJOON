package BAEKJOON.Silver.Ⅲ;

import java.util.Scanner;

public class NO15651 {

    static int n;
    static int m;
    static int [] arr;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth){
        if(m == depth) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            dfs(depth+1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int [n];
        dfs(0);
        System.out.println(sb);
    }
}
