import java.util.Arrays;

/**
//  Index  //

    1. 문제요약
    2. 접근방법
    3. 코드


//  1. 문제요약  //

    입력 받은 문자열에서 from 에 해당하는 문자를 to 로 String 메서드를 사용하지 않고 변경해서 반환하라.

    1-1. replace, indexOf, contains 을 사용하지 않고 구현해야 한다.

    1-2. 입출력
        입력 : "Hello Java, Nice to meet you! Java is fun!"
            from : "Java"
            to : "자바"
        출력 : "Hello 자바, Nice to meet you! 자바 is fun!"


//  2. 접근방법  //

    A. from 이 말이 되는 문자든 아니든 해당 문자가 to 로 대체되어야 한다.
    B. 새로운 문자열을 할당할 result 를 선언하고 ""로 초기화 한다.

    C. from 과 비교할 문자열 temp 를 선언하고 ""로 초기화 한다.
        C-1.
        A-2. 입력값이 배열이므로 char 배열을 문자로 반환해주는 String.valueOf 를 활용한다.

    D. 한 문자씩 temp 변수에 누적하여 from 과 길이가 같아졌을 때 두 문자열을 비교한다.
        D-1. 문자가 동일하면 to 를 result 에 누적하고 temp 를 ""로 초기화 한다.
        D-2. 문자가 다르면 temp 의 가장 앞 문자만 result 에 누적하고 temp의 가장 앞 문자만 제거한다.

    E. for 문이 종료되면 temp 에 남아있는 문자를 result 에 누적하고 반환한다.
 */
//  3. 코드   //
public class Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {
        String result = "";
        String temp = "";

        for (int i=0; i<str.length; i++) {
            temp += str[i];

            if (temp.length() == find.length) {
                if (temp.equals(String.valueOf(find))) {
                    result += String.valueOf(to);
                    temp = "";

                } else {
                    result += temp.substring(0, 1);
                    temp = temp.substring(1);
                }
            }
        }
        result += temp;
        return result;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "lo";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
