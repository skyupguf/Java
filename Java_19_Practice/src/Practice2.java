/**
//  Index  //

    1. 문제요약
    2. 접근방법
    3. 코드


//  1. 문제요약  //

    아스키 코드를 활용하여 문자값을 콘솔로 입력받아 각각 대문자, 소문자로 변경하여 반환하라.

    1-1. 문자가 아닌 부호, 기호일 경우 그대로 반환한다.

    1-2. 입출력
        입력 : a, 출력 : A
        입력 : b, 출력 : B
        입력 : C, 출력 : c
        입력 : D, 출력 : d
        입력 : %, 출력 : %


//  2. 접근방법  //

    A. 문자 하나는 String 의 메서드인 toUpper, toLower 를 사용할 수 없다.
       A-1. 따라서, 대문자와 소문자의 아스키 간격을 구하고 입력값의 아스키에 간격을 더해 문자로 변해 반환한다.

    B. 위 두 경우에 해당하지 않는 경우 그대로 반환한다.

 */
//  3. 코드   //
import java.util.Scanner;
public class Practice2 {
    public static void solution() {

        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 입력 : ");

        char input = sc.nextLine().charAt(0);
        int output = (int)input;

        if (output >= 65 && output <= 90) System.out.println("소문자 변환 : " + (char)(output+32));
        else if (output >= 97 && output <= 122) System.out.println("대문자 변환 : " + (char)(output-32));
        else System.out.println("기타 문자 : " + (char)output);
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution();
    }
}
