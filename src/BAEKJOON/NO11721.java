package BAEKJOON;

import java.util.Scanner;

public class NO11721 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s ;
        s = scan.nextLine();
        for (int i = 0; i < s.length(); i += 10) {
            if (i + 10 > s.length()) {
                System.out.println(s.substring(i));
            } else {
                System.out.println(s.substring(i, i + 10));
            }
        }
    }
}
