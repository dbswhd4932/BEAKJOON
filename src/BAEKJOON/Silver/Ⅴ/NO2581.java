package BAEKJOON.Silver.Ⅴ;

import java.util.ArrayList;
import java.util.Scanner;

public class NO2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // 소수를 담기 위한 list 초기화
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0; // 합계

        for (int i = M; i <= N; i++) {

            if (i == 1) continue;

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 나머지가 0 이면 false
                    isPrime = false;
                }
            }
            if (isPrime) { // 소수인 경우에는 list에 추가
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i); // 모두 더한 값
        }
        if (list.size() == 0) { // 소수가 없으면 -1
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
