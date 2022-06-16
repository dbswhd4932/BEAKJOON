package DOIT.chapter3;


class Id {

    private static int counter = 0;
    private int id;

    //생성자
    public Id() {
        id = ++counter;
    }

    //아이디를 반환하는 인스턴스 메서드
    public int getId() {
        return id;
    }

    //counter를 반환하는 클래스 메서드
    public static int getCounter() {
        return counter;

    }

    public class IdTester {
        public void main(String[] args) {

            Id a = new Id();
            Id b = new Id();

            System.out.println("a의 아이디 : " + a.getId());
            System.out.println("b의 아이디 : " + b.getId());


        }
    }
}