package BAEKJOON.Silver.Ⅰ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO1697_2 {

    static int n; //수빈위치
    static int k; //동생위치
    static boolean[] visit; //방문여부
    static int[] ch; //깊이(출력)
    static int[] dir = {-1, 1, 2}; // 움직일 수 있는 거리
    static Queue<Integer> Q = new LinkedList<>(); //BFS(최단거리)

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
            // 움직일 수 있는거리
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    nx = cur * dir[2];
                } else {
                    nx = cur + dir[i];
                }

                // 예외
                if (nx < 0 || nx > 100000) {
                    continue;
                }

                if (!visit[nx]) { //방문하지 않았으면 진행
                    Q.offer(nx); // Q 에 넣고
                    ch[nx] = ch[cur] + 1; // ch[계산값] = ch[현재값] + 1
                    visit[nx] = true; // 방문으로 변경

                    if (nx == k) { // 동생을 찾으면
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
