package BAEKJOON.Silver.Ⅳ;

import java.util.Arrays;
import java.util.Scanner;

public class NO1026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        for (int i = 0; i < n; i++) {
            answer += aArr[i] * bArr[n-1-i];
        }
        System.out.println(answer);
    }
}
