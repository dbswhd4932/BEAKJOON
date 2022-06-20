package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class NO1371X {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // a ~ z = 26
        int[] arr = new int[26];
        char[] c = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == ' ') continue;
            int idx = c[i] - 'a';
            arr[idx]++;
        }

        String ch = "";
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = String.valueOf((char)(i + 'a'));
            } else if(max == arr[i]) {
                ch += String.valueOf((char)(i + 'a'));
            }
        }

        System.out.println(ch);
    }
}
