package BAEKJOON;

import java.util.Scanner;

public class NO1929X {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean [] numbers = new boolean[N + 1];


        for (int i = 2; i < N+1; i++) {
            for (int j = i*i; j < N+1; j+=i) {
                numbers[j] = true;
            }
        }

        for (int i = M; i < N+1; i++) {
            if(numbers[i] == false) {
                System.out.println(i);
            }
        }

    }
}
