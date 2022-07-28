package BAEKJOON.Silver.Ⅰ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO1697 {
    static int n; // 시작지점
    static int k; // 동생위치
    static boolean[] visit;
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();

    public static void BFS(int n, int k) {
        Q.offer(n); // Q에 초기값 offer
        visit[n] = true; // 방문한 곳은 true

        // 처음위치가 같을때 움직이지 않아도된다
        if (n == k) {
            System.out.println(0);
            return;
        }

        // Q가 비어있지않을때까지
        while (!Q.isEmpty()) {
            int cur = Q.poll();

            // 움직일 수 있는 곳
            for (int i = 0; i < 3; i++) {
                int nx = 0;
                if (i == 0) nx = cur - 1;
                else if (i == 1) nx = cur + 1;
                else if (i == 2) nx = cur * 2;

                // 예외 처리 ( 최소 최대 )
                if( nx < 0 || nx > 100000) {
                    continue;
                }

                if (!visit[nx]) {
                    Q.offer(nx);
                    ch[nx] = ch[cur] + 1;
                    visit[nx] = true;
                    if (nx == k) {
                        System.out.println(ch[k]);
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

        visit = new boolean[100001];
        ch = new int[100001];

        BFS(n, k);

    }
}
