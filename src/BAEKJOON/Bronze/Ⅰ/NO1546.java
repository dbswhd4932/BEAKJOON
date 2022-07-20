package BAEKJOON.Bronze.Ⅰ;

import java.util.Scanner;

public class NO1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] scores = new int[n];

        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println(sum / max * 100 / (float)n);

    }
}
