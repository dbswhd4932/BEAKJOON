package BAEKJOON;

import java.util.Scanner;

public class NO1924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //월
        int y = sc.nextInt(); //일

        int sum = 0;

        String[] yoil = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < x-1 ; i++) {
            sum += date[i];
        }
        sum += y-1;
        System.out.println(yoil[sum%7]);

    }
}
