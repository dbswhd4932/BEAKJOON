package BAEKJOON.Bronze.Ⅳ;

import java.util.Scanner;

public class NO10162 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;

        if(T >= 300) {
            A = T / 300;
            T = T - 300*A;
        }
        if(T >= 60) {
            B = T / 60;
            T = T - 60*B;
        }
        if(T%10!=0) {
            System.out.println(-1);
        }
        else {
            C = T / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}
