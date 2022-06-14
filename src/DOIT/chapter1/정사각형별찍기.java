package DOIT.chapter1;

import java.util.Scanner;

public class 정사각형별찍기 {
    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("단수 :");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
