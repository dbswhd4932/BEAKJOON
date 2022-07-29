package BAEKJOON.Silver.Ⅴ;


public class NO4673_2 {

    static boolean[] visit;

    public static int d(int num) {
        int sum = num;
        while(num != 0 ) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        visit = new boolean[10001];

        for (int i = 0; i < 10001; i++) {
            int n = d(i);

            if( n <= 10000) {
                visit[n] = true;
            }
            if( visit[i] == false) {
                System.out.println(i);
            }
        }

    }
}

