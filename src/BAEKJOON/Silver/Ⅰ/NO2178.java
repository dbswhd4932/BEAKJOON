package BAEKJOON.Silver.Ⅰ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class NO2178 {

    static int[][] board;
    static int[][] cnt;
    static int n;
    static int m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> Q = new LinkedList<>();
    // 1 이동가능 && 0 불가

    public static void BFS(int x, int y) {
        Q.offer(new Point(x, y));
        board[0][0] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1) {
                    Q.offer(new Point(nx, ny));
                    board[nx][ny] = 0;
                    cnt[nx][ny] = cnt[cur.x][cur.y] + 1;

                    if (board[nx][ny] == board[n - 1][m - 1]) {
                        System.out.println(cnt[nx][ny]+1);
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
        board = new int[n][m];
        cnt = new int[n][m];

        //????????????????????????????????????
        String str;
        for (int i = 0; i < n; i++) {
            str = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(str.charAt(j) + "");
            }
        }

/* 입력불가.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }
*/

        BFS(0, 0);
    }
}
