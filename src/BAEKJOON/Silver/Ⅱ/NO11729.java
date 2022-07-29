package BAEKJOON.Silver.Ⅱ;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NO11729 {

    static int n;
    static PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                if(!Q.isEmpty()) {
                    System.out.println(Q.poll());
                } else {
                    System.out.println(0);
                }
            }
            else {
                Q.offer(num);
            }
        }
    }
}
