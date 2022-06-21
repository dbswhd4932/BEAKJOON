package BAEKJOON;

import java.util.Scanner;

public class NO2557 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String num = String.valueOf(a* b* c);

        char[] ch = num.toCharArray();
        int [] arr = new int[10];
        for (int i = 0; i < ch.length; i++) {
            int idx = ch[i] - '0';
            arr[idx]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
