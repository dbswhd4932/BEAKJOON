package BAEKJOON.Silver.Ⅳ;

import java.util.Scanner;

public class NO2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count =0;

       while(true) {
           if(n % 5 == 0) { // n 이 5의 배수일때
               count += n /5;
               break;
           } else {
               n = n - 3;
               count++;
           }
           if(n < 0) {
               count = -1;
               break;
           }
       }
        System.out.println(count);

    }
}
