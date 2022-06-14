package DOIT.chapter2;

public class 배열역순정렬2 {

    //배열 arr의 모든 요소의 합계를 구하여 반환하는 메서드
    static int sumArr(int[] arr) {
        int sum =0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int [] arr = { 5, 10 ,73, 2, -5, 42 };

        int t= 0;

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();

        for(int i=0; i<arr.length / 2; i++){
            t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
            System.out.println("a["+i+"]과(와) a["+(arr.length-i-1)+"] 를 교환합니다.");
            for (int i1 : arr) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
        System.out.println("역순정렬을 마쳤습니다.");

        System.out.println("해당 배열의 총 합은 " + sumArr(arr) + " 입니다.");
    }
}
