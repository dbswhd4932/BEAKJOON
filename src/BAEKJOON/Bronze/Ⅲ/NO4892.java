package BAEKJOON.Bronze.Ⅲ;

import java.util.Scanner;

public class NO4892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 출력값중  1.  2. 구현
        int count = 1;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            if (n % 2 == 0) {
                n = ((((n * 3) / 2) * 3) / 9);
                System.out.println(count + ". odd " + n );
                count ++;
            } else {
                n = ((((n * 3) + 1) / 2) * 3) / 9;
                System.out.println(count + ". even " + n );
                count ++;
            }

        }
    }
}
