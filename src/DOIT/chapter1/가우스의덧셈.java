package DOIT.chapter1;

import java.util.Scanner;

public class 가우스의덧셈 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;

        //가우스의 덧셈 공식
        sum = n*(n+1) /2;

        System.out.println("sum = " + sum);
    }
}
