package BAEKJOON.Silver.Ⅱ;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NO2075 {

    //2차원 배열을 사용할 필요가 없는문제.
    //우선순위큐를 활용.
    static int n;
    static int[] arr;

    // N번째 큰수를 찾으므로 내림차순으로 정렬
    static PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // arr1차원 배열의 길이는 n*n
        arr = new int[n*n];

        // 예제입력으로 25개의 숫자를 받아야 하므로, 2중 for 문을 사용
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 1차원 배열로 생각하고 입력받는다.
                Q.offer(sc.nextInt());
            }
        }
        // n번째 전까지는 poll 해주고 n번째는 poll 하며 출력
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                Q.poll();
            } else {
                System.out.println(Q.poll());
            }
        }
    }
}
