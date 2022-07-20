package BAEKJOON.Silver.Ⅴ;

import java.util.Scanner;

public class NO1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong(); // 첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
        long answer = 0; // S 에 도달할 값
        long i = 0; // 최댓값을 구하는 변수

        while(s >= answer) {
            i++;
            answer += i;
        }
        System.out.println(i-1);

    }
}
