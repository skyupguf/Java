// Java 프로그래밍 - 여러가지 연산자_1

public class Operator {
    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = 10;
        num = -10;
        System.out.println("num = " + num);

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int num1 = 10;
        int num2 = 3;
        int result;
        
        result = num1 + num2;
        result = num1 - num2;
        result = num1 * num2;
        result = num1 / num2;
        result = num1 % num2;
        System.out.println("result = " + result);

        int num3 = 0;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
        System.out.println(num3);

        System.out.println(num3--);
        System.out.println(num3);
        System.out.println(--num3);
        System.out.println(num3);

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 5;
        int numB = 3;

        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((numA > numB) && (numA == numB));
        System.out.println((numA > numB) || (numA == numB));
        System.out.println((numA > numB) ^ (numA == numB));
        System.out.println(!(numA > numB));

//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int sum = 10;
        int num4 = 5;

        System.out.println(sum += num4);
        System.out.println(sum -= num4);
        System.out.println(sum *= num4);
        System.out.println(sum /= num4);
        System.out.println(sum %= num4);

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int check = 100;
        System.out.println(check == 100 ? "yes" : "no");
    }

}