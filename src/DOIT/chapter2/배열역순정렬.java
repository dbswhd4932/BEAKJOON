package DOIT.chapter2;

import java.util.Scanner;

public class 배열역순정렬 {

    static void swap(int []a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int [] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap( a, i , a.length -i -1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요소의 개수 : ");
        int num = sc.nextInt();

        int [] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("a["+i+"] = ");
            numbers[i] = sc.nextInt();
        }

        reverse(numbers);

        System.out.println("요소들을 역순으로 정렬했습니다.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("a[" + i + "] = " + numbers[i]);
        }
    }
}
