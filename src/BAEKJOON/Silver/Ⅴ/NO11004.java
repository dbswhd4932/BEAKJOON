package BAEKJOON.Silver.Ⅴ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NO11004 {

    //수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때,
    // 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
    static int n; //수의 개수
    static int k; //k번째 수 구하기
    static int [] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        System.out.println(arr[k-1]);

    }
}
