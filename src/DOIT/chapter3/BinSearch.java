package DOIT.chapter3;

public class BinSearch {

    // 요소의 수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
    static int binSearch(int []a , int n , int key){
        int pl = 0; // 검색범위의 첫 인덱스
        int pr = n-1; // 검색범위의 끝 인덱스

        do {
            int pc = (pl +pr) / 2; // 중앙 요소의 인덱스
            if(a[pc] == key) return pc;
            else if(a[pc] < key) pl = pc+1;
            else if(a[pc] > key) pr = pc-1;
        } while(pl <= pr);
        return  -1;
    }
}
