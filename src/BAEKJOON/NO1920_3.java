package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class NO1920_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        Arrays.sort(aArr); // 꼭 정렬을 해야한다.

        int m = sc.nextInt();
        int[] bArr = new int[m];
        for (int i = 0; i < m; i++) {
            bArr[i] = sc.nextInt();
            System.out.println(binarySearch(aArr, bArr[i]));
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0; // 가장 작은 수
        int right = arr.length - 1; // 가장 큰 수

        while (left <= right) { // 작은 수가 큰수가 될때까지 찾는다
            int mid = (left + right) / 2; // 중간값= 이진탐색트리
            if (target < arr[mid]) { // 찾는수가 중간값보다 작으면
                right = mid - 1;
            } else if (target > arr[mid]) { // 찾는수가 중간값보다 크면
                left = mid + 1;
            } else if (target == arr[mid]) {
                return 1; // 찾는수가 중간값과 같으면
            }
        }
        return 0; // 못찾으면
    }
}
