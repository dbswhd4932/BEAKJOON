package DOIT.chapter2;

public class 배열복제 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int [] b = a.clone();

        b[3] = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + b[i]);
        }
    }
}
