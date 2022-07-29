package BAEKJOON.Silver.Ⅴ;

public class NO4673 {

    public static int D(int num) {
        int sum = num;
        while(num != 0 ) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        boolean [] ch = new boolean [10001];

        for (int i = 1; i <= 10000; i++) {
            int n = D(i);

            if( n <= 10000) {
                ch[n] = true;
            }
            if (ch[i] == false) {
                System.out.println(i);
            }
        }
    }
}
