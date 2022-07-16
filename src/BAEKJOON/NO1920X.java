package BAEKJOON;

import java.util.Scanner;

public class NO1920X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bArr[i] == aArr[j]) {
                    bArr[i] = 1;
                    break;
                }
            }
            if(bArr[i] != 1) {
                bArr[i] = 0;
            }
        }
        for(int x : bArr) {
            System.out.println(x);
        }
    }
}
