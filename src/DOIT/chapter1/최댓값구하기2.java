package DOIT.chapter1;

public class 최댓값구하기2 {

        static int max(int a, int b, int c) {
            int max = a;
            if ( b > max ) max = b;
            if ( c > max ) max = c;

            return max;
    }

    public static void main(String[] args) {
        System.out.println("max(1,2,3)의 최대값은 = " + max(1,2,3));
    }
}
