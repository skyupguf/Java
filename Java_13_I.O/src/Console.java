// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
//        System.out.println("입력 :");
//        int a = System.in.read() - '0';
//        System.out.println("a = " + a);
//        System.in.read(new byte[System.in.available()]);

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] c = new char[3];
//        System.out.print("입력: ");
//        reader.read(c);
//        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력1: ");
//        System.out.println(sc.next());
//        sc.nextLine();

//        System.out.println("입력2: ");
//        System.out.println(sc.nextInt()); // 숫자만 읽을 수 있다.
//        sc.nextLine();

        System.out.print("입력3: ");
        System.out.println(sc.nextLine());

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("123");
        String str = Integer.toString(123);

//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("줄바꿈");
        System.out.println("됨");

        System.out.print("줄바꿈");
        System.out.print("안됨");
        System.out.println();

        String s = "자바";
        int number = 3;
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);

//      출력형식
        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);
        System.out.printf("%f\n", 5.2f);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "abcd");

//      출력자리
        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);
        System.out.printf("%-5d\n", 123);

//      소수점 자리
        System.out.printf("%.2f\n", 1.1256778f); // 지정한 자리까지 반올림

    }
}