package BAEKJOON;

import java.util.Scanner;

public class NO1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.trim();

        String[] arr = str.split(" ");

        if(arr.length == 1 && arr[0].equals("")){
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
