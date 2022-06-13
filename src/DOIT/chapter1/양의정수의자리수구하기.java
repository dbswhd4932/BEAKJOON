package DOIT.chapter1;

import java.util.Scanner;

public class 양의정수의자리수구하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num ;

        System.out.println("양의 정수의 자리값을 구합니다.");

        do {
            System.out.print("양의 정수를 입력하세요.");
            num = sc.nextInt();
        } while( num <= 0);

        int cnt = 0;
        while(num > 0 ){
            num = num/10;
            cnt ++;
        }

        System.out.println("그 수는 " + cnt + "자리 입니다." );
    }
}
