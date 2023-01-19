package C_Static_and_Final;

public class Cola {
//  멤버변수의 초기화 방법
//  C-1. 명시적초기화 : 변수선언과 함께 값을 할당한다.
//  final 사용시 명시적이든 블럭이든 단 한 번의 할당만 가능하다.
//    private static final int size = 20;
    private static int size = 20;
    private int date = 10;

//  C-2. 블럭초기화는 class, instance, 생성자 순으로 실행된다.
//  C-3. class 블럭은 객체 생성시 한 번만 수행된다.
//  클래스 초기화 블럭
    static {
        System.out.println("클래스 초기화 블럭");
        size = 40;
//        date = 20;  date 는 인스턴스 변수이므로 static 으로 설정할 수 없다.
    }
//  인스턴스 초기화 블럭
    {
        System.out.println("인스턴스 초기화 블럭");
        size = 50;
        date = 20;
    }
//  생성자
    public Cola() {
        System.out.println("생성자 호출");
        size = 60;
        date = 30;
    }
}
