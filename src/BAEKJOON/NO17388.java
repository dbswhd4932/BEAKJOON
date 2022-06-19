package BAEKJOON;

import java.util.Scanner;

public class NO17388 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();

        if(S + K + H >= 100 ){
            System.out.println("OK");
        } else {
            if( S > H && K > H) {
                System.out.println("Hanyang");
            } else if ( S > K && H > K) {
                System.out.println("Korea");
            } else if (S < K && S < H) {
                System.out.println("Soongsil");
            }
        }
    }
}
