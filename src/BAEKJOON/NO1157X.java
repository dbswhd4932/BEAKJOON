package BAEKJOON;

import java.util.Scanner;

public class NO1157X {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];


        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        int max = arr[0];
        char ch;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            ch = (char) max;
            System.out.println(ch);
        }
    }
}

