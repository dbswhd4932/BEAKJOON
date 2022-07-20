package BAEKJOON.Bronze.Ⅲ;

import java.util.Scanner;

public class NO2446 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        // 위에서 5번째까지 ( * 이 1개 찍힐때까지 )
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (num*2)-(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *이 1개에서 밑에부분까지
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
