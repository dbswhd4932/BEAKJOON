package DOIT.chapter1;

import java.util.Scanner;

public class 총합구하기2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 숫자의 합을 구합니다. ");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();
        int sum = 0;

//       for문 풀이
//        for(int i=1; i<=n; i++){
//            sum += i;
//        }

        // while 문 풀이
        int j =0;
        while(j <= n){
            sum += j;
            j++;
        }

        System.out.println("1부터 " +  n + "까지의 합은 " + sum + " 입니다.");
    }
}
