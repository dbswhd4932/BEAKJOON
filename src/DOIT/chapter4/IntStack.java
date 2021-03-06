package DOIT.chapter4;

public class IntStack {

    private int max; //스택용량
    private int ptr; //스택 포인터
    private int[] stk; // 스택 본체


    //실행 시 예외 : 스택이 비어있음
    public class EmptyIntStckException extends RuntimeException {
        public EmptyIntStckException() {
        }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    //생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];             //스택본체용 배열을 생성
        } catch (OutOfMemoryError e) {    // 생성할 수 없음.
            max = 0;
        }
    }
}
