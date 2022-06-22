package BAEKJOON;

import java.util.Scanner;

public class NO1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] arr = new double[N];
        double max = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            avg = ((arr[i] / max) * 100) / N;
        }

        System.out.println("max = " + max);
        System.out.println(avg);
    }
}
