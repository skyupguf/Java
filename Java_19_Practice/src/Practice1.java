/**
//  Index  //

    1. 문제요약
    2. 접근방법
    3. 코드


//  1. 문제요약  //

    입력받은 정수 자료형을 거꾸로 변환하여 출력하는 프로그램을 작성하라.

    1-1. 정수형태로 반환해야 한다. 예를 들어 110이면 011이 되는데 11을 반환해야 한다.

    1-2. 입출력
        입력 : 12345, 출력 : 54321
        입력 : -12345, 출력 : -54321
        입력 : 100, 출력 : 1
        입력 : 0, 출력 : 0


//  2. 접근방법  //

    A. 우선 입력받은 수를 Inteager.toString 을 이용하거나 ""와 더해 문자열로 형 변환 시킨다.
        A-1. 형 변환이 완료되면 문자열을 charAt으로 순회하여 하나씩 확인한다.
        A-2. 이 때, 가장 앞의 부호가 -일 경우 부호를 따로 변수에 할당해 놓는다.
        A-3. 가장 뒤의 문자 부터 루프하면서 새로 선언한 String 변수에 하나씩 누적한다.
        A-4. 루프가 종료되면 부호 변수를 완성된 변수에 더하고 정수형으로 형 변환을 해 반환한다.

    B. 1의 자리부터 차례대로 역 순으로 계산 하면 되니 10을 이용해 나머지와 몫으로 분리해 루프한다.
        B-1. int 형 변수 share 를 선언하고 num이 음수일 경우 -1을 곱해 양수로 변환한다.
        B-2. 완성된 값을 할당할 result 변수를 선언하고 0을 할당한다.
        B-3. share가 0보다 클 때까지 루프하면서 result * 10에 10으로 나눈 나머지 share를 누적으로 더한다.
        B-4. share를 10으로 나눈 몫을 할당한다.
        B-5. num이 음수면 result에 -1을 곱해 완성한다.

*/
//  3. 코드   //
public class Practice1 {
    public static void solution(int num) {
        
//      방법 1
        String numStr = num + "";
        String reverse = "";

        for (int i=numStr.length()-1; i>=0; i--) {
            if (numStr.charAt(i) == '-') reverse = '-' + reverse;
            else reverse += numStr.charAt(i);
        }
        int result = Integer.parseInt(reverse);
        System.out.println("result = " + result);


//      방법 2
        int share = num < 0 ? num * -1 : num;
        int result2 = 0;
        
        while (share > 0) {
            result2 += (result2 * 10) + (share % 10);
            share /= 10;
        }
        result2 = num < 0 ? result2 * -1 : result2;
        System.out.println("result2 = " + result2);
    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}