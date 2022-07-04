package BAEKJOON;

import java.util.Scanner;

public class NO1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];

        // 모두 대문자로 저장
        s = s.toUpperCase();

        // s.charAt(i) - 'A' -> 대문자 A 일경우 arr[0]에 저장
        // s.charAt(i) - 'A' -> 대문자 B 일경우 arr[1]에 저장
        // s.charAt(i) - 'A' -> 대문자 C 일경우 arr[2]에 저장
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        int max = 0;
        char answer = ' ';
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i]; // 최댓값 구하기
                answer = (char) (i+'A');
            } else if ( max == arr[i]) { // 만약 max 값이 arr[i] 에 있다면 ? 출력
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}

