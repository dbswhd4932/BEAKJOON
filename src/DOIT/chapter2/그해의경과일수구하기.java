package DOIT.chapter2;

import java.util.Scanner;

public class 그해의경과일수구하기 {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년  0
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년  1
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        // 4로 나누어떨어지고, 100으로 나누어떨어지지않거나, 400으로 나누어떨어지는 년은 윤년
        // 4로 나누어떨어지고, 100으로 나누어떨어지거나 ,400으로 나누어떨어지지않는 년은 평년
    }

    static int dayOfYear(int y, int m, int d){
        int days = d; //일수

        for (int i = 1; i < m; i++) { // 1월 ~ (m-1)월의 일수를 더한다.
            days += mdays[isLeap(y)][i-1]; //윤년이면 1 , 평년이면 0
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("그 해 경과 일수를 구합니다.");

            System.out.print("년 : "); int year = sc.nextInt();
            System.out.print("월 : "); int month = sc.nextInt();
            System.out.print("일 : "); int day = sc.nextInt();

            System.out.printf("그 해 %d 일 째입니다.", dayOfYear(year,month,day));

    }

}
