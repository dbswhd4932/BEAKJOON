package BAEKJOON;

import java.util.Scanner;

public class NO4948X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();
            if (n == 0) break;

            boolean[] numbers = new boolean[2 * n + 1];
            numbers[0] = true;
            numbers[1] = true;

            for (int i = 2; i < Math.sqrt(2 * n + 1); i++) {
                for (int j = i * i; j < 2 * n + 1; j += i) {
                    numbers[j] = true;
                }
            }

            int count = 0;
            for (int i = n + 1; i < 2 * n + 1; i++) {
                if (numbers[i] == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

