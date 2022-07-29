package BAEKJOON.Silver.Ⅰ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO1697 {

    static int n; //수빈이위치
    static int k; //동생위치
    static int[] dir = {-1, 1, 2};
    static int[] cnt;
    static boolean[] visit;
    static Queue<Integer> Q = new LinkedList<>();

    public static void BFS(int n, int k) {
        Q.offer(n);
        visit[n] = true;

        if (n == k) {
            System.out.println(0);
            return;
        }

        while (!Q.isEmpty()) {
            int cur = Q.poll();
            int nx = 0;
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    nx = cur * dir[2];
                } else {
                    nx = cur + dir[i];
                }
                if (nx > 100000 || nx < 0) {
                    continue;
                }

                if (!visit[nx]) {
                    visit[nx] = true;
                    Q.offer(nx);
                    cnt[nx] = cnt[cur] + 1;
                    if (nx == k) {
                        System.out.println(cnt[k]);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        cnt = new int[100001];
        visit = new boolean[100001];

        BFS(n, k);

    }
}
