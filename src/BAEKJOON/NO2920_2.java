package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class NO2920_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arrA = {1,2,3,4,5,6,7,8}; //ascending 조건
        int [] arrB = {8,7,6,5,4,3,2,1}; //descending 조건

        int [] arr = new int[8]; // 길이가 8 인 배열 생성
        for (int i = 0; i < arr.length; i++) { // 배열에 값 입력
            arr[i] = sc.nextInt();
        }

        if(Arrays.equals(arr,arrA)){ // 같으면
            System.out.println("ascending");
        } else if (Arrays.equals(arr,arrB)){ // 같으면
            System.out.println("descending");
        } else { // 다르면
            System.out.println("mixed");
        }
    }
}
