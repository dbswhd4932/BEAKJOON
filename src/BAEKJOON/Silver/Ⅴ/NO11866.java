package BAEKJOON.Silver.Ⅴ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NO11866 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        sb.append("<");
        while (queue.size() != 1) {
            for (int i = 1; i <= k; i++) {
                if (i < k) {
                    queue.offer(queue.poll());
                } else {
                    sb.append(queue.poll() + ", ");
                }
            }
        }
        System.out.print(sb);
        System.out.print(queue.poll());
        System.out.print(">");

    }
}
