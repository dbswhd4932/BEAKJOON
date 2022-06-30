package BAEKJOON;

import java.util.Scanner;

public class NO2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i =0;
        int sum =1;

        while(sum < num ){
            i++;
            sum += 6*i;
        }
        System.out.println(i+1);
    }
}
