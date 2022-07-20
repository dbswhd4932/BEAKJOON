package BAEKJOON.Silver.Ⅳ;

import java.util.Arrays;
import java.util.Scanner;

public class NO1920_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        Arrays.sort(aArr);

        int m = sc.nextInt();
        int[] bArr = new int[m];
        for (int i = 0; i < m; i++) {
            bArr[i] = sc.nextInt();
            System.out.println(binarySearch(aArr, bArr[i]));
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target == arr[mid]) {
                return 1;
            }
        }
        return 0;
    }
}
