package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO2920 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 첫줄에 8개 숫자
        int [] arr = new int [8];
        // 숫자입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
 
        String answer = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]-1){
                answer = "ascending";
            } else if (arr[i] == arr[i+1]+1){
                answer = "descending";
            } else {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
