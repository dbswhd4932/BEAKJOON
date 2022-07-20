package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO1568 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bird = 1;
        int cnt = 0;

       while(n > 0) {
           n = n-bird;
           bird = bird +1;
           cnt ++;

           if(n < bird) {
               bird = 1;
           }
       }
        System.out.println(cnt);
    }
}

