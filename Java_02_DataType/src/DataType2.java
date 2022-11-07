// Java 프로그래밍 - 자료형_2

public class DataType2 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");

        String eName = "Ha";
        System.out.println("eName = " + eName);

        String eNum = "123";
        System.out.println("eNum = " + eNum);

//      1-1. equals
        String eNum2 = "124";
        String eNum3 = "124";
        System.out.println(eNum2.equals(eNum3));
        System.out.println(eNum2 == eNum3);

        String eNum4 = new String("124");
        System.out.println(eNum2.equals(eNum4));
        System.out.println(eNum2 == eNum4);
//      equals : 값을 비교, == : 객체를 비교
//      eNum2와 eNum3는 "124"가 할당된 동일한 메모리를 가리키는 변수이다.
//      eNum4는 new String 이라는 생성자로 다른 메모리에 "124"를 할당하기 때문에 == 가 false 가된다.

//      1-2. indexOf
        String greetings = "Have a nice day";
        System.out.println(greetings.indexOf("a"));
        System.out.println(greetings.indexOf("a", greetings.indexOf("a") + 1));
        System.out.println(greetings.indexOf("a", greetings.indexOf("a") + 5));

//      1-3. replace
//      문자열에 타겟이 여러개일 경우 모두 변경해 준다.
        System.out.println(greetings.replace("a", "x"));
        System.out.println(greetings.replace("day", "week"));

//      1-4. substring
        System.out.println(greetings.substring(0, 4));
        System.out.println(greetings.substring(0, greetings.indexOf(" ") + 2));

//      1-5. toUpperCase
        System.out.println(greetings.toUpperCase());
        System.out.println(greetings.toLowerCase());

//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

//      String 으로 문자열 변경시 StringBuffer 와 달리 새 객체를 생성하므로 메모리를 더 많이 사용하게 된다.
        String sb2 = "01234";
        String sb3 = "56789";
        String sb4 = sb2;
        System.out.println(sb2 == sb4);
        sb2 += sb3;
        System.out.println(sb2 == sb4);
/*
        문제점. 왜 String 으로 생성한 문자와 StringBuffer 의 문자는 비교가 안될까?
        1. String 과 StringBuffer 의 문자는 왜 비교할 경우 에러를 출력하는가?
            System.out.println(sb1 == sb2); 비교가 불가능 하다는 에러가 발생한다.
            System.out.println(sb1.equals(sb2)); 값이 동일함에도 false 를 리턴한다.
            StringBuffer 클래스는 equals 메서드가 오버라이딩 되어있지 않아 값을 문자열화해서 비교해야 한다고 한다.
            조금 더 이해를 위한 보충설명이 필요하다.
            System.out.println(sb1.toString().equals(sb2));

        2. StringBuffer 로 생성해준 문자열은 비교 메서드와 연산자로 모두 비교가 가능하나 같은 문자열도 false 가 나온다.
            StringBuffer sb5 = new StringBuffer("a");
            StringBuffer sb6 = new StringBuffer("a");
            System.out.println(sb5 == sb6); 서로 다른 메모리를 사용하므로 false 가 나온다.
            System.out.println(sb5.equals(sb6)); 같은 값이어도 false 가 나온다.
            System.out.println(sb5.toString().equals(sb6.toString())); true 가 나온다.
*/
//      3. 자료형 - 배열
        System.out.println("== 배열 ==");

        int[] myArray1 = {0, 1, 2, 3, 4};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[3]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

//      String[] myArray3 = {}; 크기가 정해지지 않으면 인덱스를 활용할 수 없다.
        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);

//      정해진 크기 이상의 길이를 넘어서는 값을 추가할 수 없다.
        myArray3[3] = "!";
//      System.out.println(myArray3[0] + myArray3[1] + myArray3[2] + myArray3[3]);
    }
}