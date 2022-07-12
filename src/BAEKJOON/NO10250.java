package BAEKJOON;

import java.util.Scanner;

public class NO10250 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int x = n / h + 1; // 호수
            int y = n % h; // 층수

            if( n % h == 0 ) {
                x = n / h ;
                y = h;
            }
            System.out.println(y*100 + x);
        }
    }
}
