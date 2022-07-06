package BAEKJOON;

import java.util.Scanner;

public class NO2609 {

    static int gcd(int a , int b){
        if( a % b  == 0 ){
            return b;
        }
        return gcd(b , a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));
    }
}
