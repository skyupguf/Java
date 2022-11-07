// Java 프로그래밍 - 조건문

public class Conditional {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int score = 91;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);

//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "orange";

        switch (fruit) {
            case "apple" :
                System.out.println(1000);
                break;
            case "orange" :
                System.out.println(800);
                break;
            default :
                System.out.println(0);
        }

//      Q1. number 의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;
        int check = number % 2;

        if (check == 1) System.out.println("홀수");
        else System.out.println("짝수");


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
        int tens = score / 10;
        switch (tens) {
            case 10 :
            case 9 : grade = "A";
                break;
            case 8 : grade = "B";
                break;
            case 7 : grade = "C";
                break;
            case 6 : grade = "D";
                break;
            default : grade = "F";
        }
        System.out.println(grade);

        int units = score % 10;
        String sign = "\0";
        if (tens == 10 | units >= 6) sign = "+";
        else if (units <= 1) sign = "-";
        System.out.println(grade + sign);

    }
}