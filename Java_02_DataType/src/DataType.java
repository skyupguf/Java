// Java 프로그래밍 - 자료형_1

/*
    자료형 분류
    1. 기본형
        변수의 저장 공간에 값 자체가 저장되는 자료형

        1-1. 논리형 boolean 1바이트
        1-2. 문자형 char 2바이트
        1-3. 정수형 byte 1바이트
                   short 2바이트
                   int 4바이트
                   long 8바이트
        1-4. 실수형 float 4바이트
                   double 8바이트

        바이트(byte)는 컴퓨터의 기억장치의 크기를 나타내는 단위이며, 바이트의 실질적 의미는 ASCII 문자 하나를 나타낼 수 있다는 것
        워드(word)는 CPU 가 한 번에 처리할 수 있는 데이터의 크기
        8비트는 1바이트

        컴퓨터에 저장되는 2진수는 정수와 실수 모두 앞에 1비트를 부호비트로 사용해 0일 경우 양수 1일 경우 음수로 표현한다.
        실수는 지수와 가수로 나뉜다.

    2. 참조형
        변수의 저장 공간에 참조 값이 저장되는 자료형
        배열, 클래스, 인터페이스
*/
public class DataType {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//
//      1-1. 정수
        int num = 1;
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        int num2 = Integer.MAX_VALUE + 1;
        System.out.println("num2 = " + num2);

        long num3 = (long)Integer.MAX_VALUE + 1;
        System.out.println("num3 = " + num3);

        long num4 = 21474850000L; // 정수형태로 넣으려면 L을 추가해준다.
        System.out.println("num4 = " + num4);

//      1-2. 실수
        float floatNum = 1.23f;
        double doubleNum = 1.23;
        System.out.println(floatNum);
        System.out.println(doubleNum);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE + 1);
        System.out.println(Double.MAX_VALUE - 1);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MIN_VALUE + 1);
        System.out.println(Double.MIN_VALUE - 1);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        System.out.println("0b" + Integer.toBinaryString(numBase2));

        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        System.out.println("0" + Integer.toOctalString(numBase8));

        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16);
        System.out.println("0x" + Integer.toHexString(numBase16));

//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean pass = true;
        boolean pass2 = false;

//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        char keyLast = 'z';
        System.out.println((int)keyFirst);
        System.out.println((int)keyLast);
        System.out.println((float)keyFirst);
        System.out.println((double)keyLast);
    }
}