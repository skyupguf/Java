// Java 프로그래밍 - 자료형_1

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