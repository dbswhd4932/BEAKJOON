package BAEKJOON.Silver.Ⅴ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double v = Double.parseDouble(str[2]);

        int n = (int)Math.ceil((v-b)/(a-b)); // 소수가 나오면 올림을 한다.

        System.out.println(n);
    }
}
