package BAEKJOON.Bronze.Ⅳ;

import java.util.Locale;
import java.util.Scanner;

public class NO1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if(str.equals("#")) break;
            int cnt = 0;
            char[] c = str.toUpperCase().toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (c[i] == ('A') ||
                        c[i] == ('E') ||
                        c[i] == ('I') ||
                        c[i] == ('O') ||
                        c[i] == ('U')) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
