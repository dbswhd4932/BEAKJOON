package BAEKJOON.Silver.Ⅱ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class NO1927 {

    static int n;
    static PriorityQueue<Integer> Q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (!Q.isEmpty()) {
                    System.out.println(Q.poll());
                } else {
                    System.out.println(0);
                }
            } else {
                Q.offer(num);
            }
        }
    }
}
