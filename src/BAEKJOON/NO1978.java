package BAEKJOON;

import java.util.Scanner;

public class NO1978 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0; // 카운트 변수

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean isPrime = true; // 소수인지 아닌지 구별

            if(num == 1 ) continue; // 1은 소수가 아니므로 패스

            // 2 ~ num 까지 나눠지는 수 있는지 확인
            for (int j = 2; j < num; j++) {
                if( num % j == 0 ){ // 나눠지는 수가 있으면 false로 변경
                    isPrime = false;
                }
            }
            // true 일 경우만 count 에 더한다
            if(isPrime) count++;

        }
        System.out.println(count);
    }
}
