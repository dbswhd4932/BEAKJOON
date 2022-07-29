package BAEKJOON.Silver.Ⅰ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class NO2178_2 {

    static int n;
    static int m;
    static int[][] arr;
    static int[][] cnt;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point2> Q = new LinkedList<>();

    public static void BFS(int x, int y) {
        arr[0][0] = 1;
        Q.offer(new Point2(x, y));

        while (!Q.isEmpty()) {
            Point2 cur = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                    Q.offer(new Point2(nx, ny));
                    arr[nx][ny] = 0;
                    cnt[nx][ny] = cnt[cur.x][cur.y] + 1;

                    if (arr[nx][ny] == arr[n-1][m-1]) {
                        System.out.println(cnt[nx][ny] + 1);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];
        cnt = new int[n][m];

        String s;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s.charAt(j)+"");
            }
        }

        BFS(0, 0);
    }
}
