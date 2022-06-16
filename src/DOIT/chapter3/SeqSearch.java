package DOIT.chapter3;

import java.util.Scanner;

public class SeqSearch {

    // 요소의 수가 n인 배열 a에서 key와 같은 요소를 선형검색합니다.
   static int seqSearch(int[]a, int n , int key) {
       int i=0;

       while(true){
           if( i== n)
               return -1;
           if( i== key)
               return i;

           i++;
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("요소의 수 ");
       int num = sc.nextInt();
       int[] x = new int[num];

       for (int i = 0; i < num; i++) {
           System.out.print("x[" + i + "] : ");
           x[i] = sc.nextInt();
       }

       System.out.print("검색할 값 : ");
       int ky = sc.nextInt();

       int idx = seqSearch(x, num, ky);

       if(idx == -1){
           System.out.println("찾는 요소가 없습니다.");
       } else {
           System.out.println("찾는 요소는 " + idx + "번째에 있습니다.");
       }

   }
}
