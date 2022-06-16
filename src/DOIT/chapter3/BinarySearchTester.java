package DOIT.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요소수의 수 :  ");
        int num = sc.nextInt();

        int [] x = new int[num]; //요소수의 수가 num인 배열

        System.out.println("오름 차순으로 입력하세요.");

        System.out.print("x[0]: "); // 배열의 첫 요소를 먼저 입력
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("x["+i+"] :");
                x[i] = sc.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if( idx < 0 ){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은/는 x[" + idx + "] 에 있습니다.");
        }
    }
}
