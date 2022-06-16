package DOIT.chapter2;

public class 확장for문 {
    public static void main(String[] args) {

        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        double sum = 0;

        for (double v : a) {
            sum += v;
        }

        System.out.println("sum = " + sum);

    }
}
