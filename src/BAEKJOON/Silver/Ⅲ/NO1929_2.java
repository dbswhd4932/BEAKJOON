package BAEKJOON.Silver.Ⅲ;

import java.util.Scanner;

public class NO1929_2 {
    public static void main(String[] args) {

        //에라토스테네스의 체를 이용하여 풀이
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i < Math.sqrt(N+1); i++) {
            // j 에서 i의 제곱을 사용하므로 제곱근까지 구한다.
            for (int j = i * i; j < N + 1; j += i) {
                isPrime[j] = true;
            }
        }
        for (int i = M; i < N+1; i++) {
            if(isPrime[i] == false) {
                System.out.println(i);
            }
        }
    }
}

