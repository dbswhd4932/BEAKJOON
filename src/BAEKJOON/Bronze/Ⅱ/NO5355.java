package BAEKJOON.Bronze.Ⅱ;

import java.util.Scanner;

public class NO5355 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            float num = Float.parseFloat(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].equals("@")) num *= 3;
                else if (arr[j].equals("#")) num -= 7;
                else if (arr[j].equals("%")) num += 5;
            }
            System.out.printf("%.2f%n", num);
        }
    }
}
