package DOIT.chapter2;

public class int형배열 {
    public static void main(String[] args) {

        int [] a = new int [5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }

    }
}
