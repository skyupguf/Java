// Java 프로그래밍 - 변수

public class Var {
    public static void main(String[] args) {

//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");

        int age = 34;
        System.out.println(age);

        String country = "Korea";
        System.out.println(country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");

//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 1000;
        int apple2 = 2000;
        int _apple = 3000;
        int $apple = 4000;
        System.out.println(apple);
        System.out.println(apple2);
        System.out.println(_apple);
        System.out.println("$apple = " + $apple);

//      2-2. 숫자로 시작 X
//        int 2apple = 2000;

//      2-3. 대소문자 구분
        int banana = 1000;
        int BANANA = 2000;
        System.out.println(banana);
        System.out.println("BANANA = " + BANANA);

//      2-4. 공백 사용 X
//        int apple one = 2000;
        int apple_one = 1000;
        int appleOne = 1000;

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...
//        int if = 1000;

//      참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println(사과);

//      3. 표기법

//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수
        int myAge = 34;
        String myName = "Ha";
        System.out.println(myAge);
        System.out.println(myName);

//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        int MyAge = 34;
        String MyName = "Ha";

//      참고) 스네이크 표기법 (snake_case)
//      사용 X
        int my_age = 34;
        String my_name = "Ha";

    }
}

/*
    자바의 변수 종류
    1. 멤버 (소속, 클래스, 필드, 속성) 변수
        클래스 내부에 소속된 변수로 주로 클래스 내부 메서드에서 사용된다.
        멤버 변수는 기본값으로 제로값으로 초기화 되어져 있다.
        boolean - false
        char - '\0', '\u0000'
        byte, short, int - 0
        long - 0l, 0L
        float - 0.0f, 0.0F
        double - 0.0d, 0.0D
        String, Date - null

    2. 지역 변수
        메서드 내부에서 선언되어 사용되는 변수, 즉 메서드 내부에서만 사용이 가능하다.
        실행이 메서드 내부를 벗어나면 메모리에서 사라진다.
        지역변수는 초기화 없이 변수를 사용하면 컴파일 에러가 발생하므로 반드시 초기화를 해준다.
*/