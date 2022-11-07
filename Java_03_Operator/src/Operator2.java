// Java 프로그래밍 - 여러가지 연산자_2

public class Operator2 {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
        int num = 4;
        int num2 = 7;

//      1-1. AND 연산자 (&)
        int result = num & num2;
        System.out.println(result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      1-2. OR 연산자 (|)
        int result2 = num | num2;
        System.out.println(result2);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result2)));

//      1-3. XOR 연산자 (^)
        int result3 = num ^ num2;
        System.out.println(result3);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result3)));

//      1-4. 반전 연산자 (~)
        int result4 = ~num;
        System.out.println(result4);
        System.out.printf("%s\n", Integer.toBinaryString(result4));

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
        int numA = 3;

//      2-1. << 연산자
        int resultA = numA << 1;
        System.out.println(resultA);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(resultA)));

//      2-2. >> 연산자
        int resultB = numA >> 1;
        System.out.println(resultB);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(resultB)));

//      2-3. >>> 연산자
        numA = -3;
        int resultC = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(resultC));

    }

}

