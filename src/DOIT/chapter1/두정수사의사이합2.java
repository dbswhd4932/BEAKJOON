package DOIT.chapter1;

import java.util.Scanner;

public class 두정수사의사이합2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        do {
            System.out.print("a의 값 : ");
            a = sc.nextInt();
            System.out.print("b의 값 : ");
            b = sc.nextInt();
        } while( a >= b);

        System.out.println("b-a는 " + (b-a) + "입니다.");
    }
}
