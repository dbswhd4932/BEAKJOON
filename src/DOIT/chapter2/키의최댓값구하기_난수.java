package DOIT.chapter2;

import java.util.Scanner;

public class 키의최댓값구하기_난수 {

    static int maxOf(int[] a ){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int person = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.println("키는 랜덤으로 정합니다.");
        System.out.print("사람의 수 :");
        person = sc.nextInt();


        int [] height = new int[person];

        for(int i =0; i<person; i++){
            System.out.print("person["+i+"] 의 키를 정해주세요 : ");
            height[i] = (100+(int)(Math.random()*100));
            System.out.println(height[i]);
        }

        System.out.println("사람들 중 가장 키큰 사람의 키는 " + maxOf(height) + "cm 입니다.");
    }
}
