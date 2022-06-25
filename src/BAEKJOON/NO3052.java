package BAEKJOON;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NO3052 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            list.add(arr[i]%42);
        }

        for (Integer num : list) {
            set.add(num);
        }

        System.out.println(set.size());
    }
}
