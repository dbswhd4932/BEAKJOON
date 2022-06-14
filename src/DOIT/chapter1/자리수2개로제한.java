package DOIT.chapter1;

import java.util.Scanner;

public class 자리수2개로제한 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.print("2자리 정수를 입력하세요.");
            num = sc.nextInt();

        } while( num < 10 || num > 99);

        System.out.println("입력하신 정수값은 " + num + "입니다.");
    }
}
