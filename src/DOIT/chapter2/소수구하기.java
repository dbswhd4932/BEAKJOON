package DOIT.chapter2;

public class 소수구하기 {
    public static void main(String[] args) {
        // 2 ~ 1000 사이의 숫자 중 소수 구하기

        for (int i = 2; i <= 1000; i++) {
            int j = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
