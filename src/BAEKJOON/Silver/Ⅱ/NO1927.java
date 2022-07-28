package BAEKJOON.Silver.Ⅱ;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NO1927 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num == 0) {
                if(!queue.isEmpty()) {
                    System.out.println(queue.poll());
                } else {
                    System.out.println(0);
                }
            }
            else {
                queue.offer(num);
            }
        }
    }
}
