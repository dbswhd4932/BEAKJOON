package BAEKJOON;

import java.util.Scanner;

public class NO2747 {

//    static int fibonacci(int n) {
//        if (n < 3) {
//            return 1;
//        }
//        return fibonacci(n - 2) + fibonacci(n - 1);
//    }

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        StringTokenizer st = new StringTokenizer(s);
//        int a = Integer.parseInt(st.nextToken());
//        System.out.println(fibonacci(a));

        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        System.out.println(fibonacci(a));

        int n = sc.nextInt();

        int a = 1;
        int b = 1;
        int c = 0;

        if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println(c);
        }



    }
}
