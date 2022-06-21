package BAEKJOON;

import java.util.Scanner;

public class NO10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
