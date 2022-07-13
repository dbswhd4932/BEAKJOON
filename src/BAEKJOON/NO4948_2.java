package BAEKJOON;

import java.util.Scanner;

public class NO4948_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //에라토스테네스의 체를 이용하여 풀이

        while(true) {
            int n = sc.nextInt();

            if(n == 0) break;

            boolean[] isPrime = new boolean[n * 2 + 1];
            isPrime[0] = true;
            isPrime[1] = true;
            for (int i = 2; i < Math.sqrt(n * 2 + 1); i++) {
                for (int j = i * i; j < n * 2 + 1; j += i) {
                    isPrime[j] = true;
                }
            }
            int count = 0;
            for (int i = n + 1; i < n * 2 + 1; i++) {
                if (isPrime[i] == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
