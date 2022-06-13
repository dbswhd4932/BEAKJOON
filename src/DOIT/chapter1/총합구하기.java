package DOIT.chapter1;

public class 총합구하기 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 7; i++) {
            if (i < 7) {
                sum += i;
                System.out.print(i + "+");
            } else {
                sum += i;
                System.out.println(i + "=" + sum);
            }
        }
    }
}
