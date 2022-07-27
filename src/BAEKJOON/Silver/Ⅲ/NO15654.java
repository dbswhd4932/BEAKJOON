package BAEKJOON.Silver.Ⅲ;

import java.util.Arrays;
import java.util.Scanner;

public class NO15654 {

    static int n;
    static int m;
    static int[] num; // 입력받을 배열
    static int[] arr; // 정답을 구할 배열
    static boolean[] visit; // 방문했는지에 대한 배열
    static StringBuilder sb = new StringBuilder(); // 일반출력 시 시간초과

    public static void DFS(int depth) {

        Arrays.sort(num); // [1,7,8,9]

        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    arr[depth] = num[i];
                    DFS(depth + 1);
                    visit[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        visit = new boolean[n];
        num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        DFS(0);
        System.out.println(sb.toString());

    }
}
