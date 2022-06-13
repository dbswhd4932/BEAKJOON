package DOIT.chapter1;

public class 두정수의사이합 {

    static int sumof(int a, int b){
       int max = 0;
       int min = 0;
       int sum = 0;

       if( a > b) {
           max = a;
           min = b;
       } else {
           max = b;
           min = a;
       }

       for(int i = min; i<= max; i++){
           sum += i;
       }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumof(3,5));
        System.out.println(sumof(6,4));
    }
}
