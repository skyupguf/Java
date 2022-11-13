/*
 * 로직 작성
 *   달력은 해당 년도의 해당 월이 며칠이 존재하는지 1일이 무슨 요일부터 시작하는지를 알아야 한다.
 *   그리고 4년마다 윤년이 존재하기 때문에 2월이 29일까지 존재하는지도 판단해야 한다.
 *   따라서 달력을 만들기 위해서 필요한 정보를 정리하자면
 *
 *   1. 특정 년도의 윤년 여부
 *   2. 1번을 토대로 특정 달의 일 수
 *   3. 특정 년도의 특정 달의 1일의 시작 요일
 *   4. 7일 기준으로 줄바꿈
 *
 *   순서를 생각해보면
 *   1. 년도와 월을 입력받는다.
 *   2. 입력받은 년도를 통해 윤년체크를 하고 체크한 내용과 입력받은 월을 통해 전체일을 구한다.
 *   3. 년도, 월, 1일을 통해 요일을 찾아낸다.
 *   4. 요일에 맞춰 전체일을 7줄로 나눠 출력한다.
 *
 *   윤년 계산법과 31일 30일 29, 28일을 직접 나눠 계산이 가능한데
 *   문제가 제시하는 LocalDate 클래스를 활용하면 2, 3을 1번 없이 구할 수 있다.
 * */

import java.time.LocalDate;
import java.util.Scanner;


public class Exam5 {
    public static void main(String[] args) {

//      1. 년, 월 입력 받기
        System.out.println("[달력 출력 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.println();
        System.out.println();

//      2. LocalDate 를 활용해 특정 달의 시작요일과 전체 일자를 구한다.
        LocalDate referenceDate = LocalDate.of(year, month, 1);
        int startDay = referenceDate.getDayOfWeek().getValue();
        int fullDate = referenceDate.lengthOfMonth();

//      3. 달력 출력하기
        System.out.printf("[%d년 %02d월]", year, month);
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");

//        3-1. 시작 요일 부터 날짜를 출력하기 위해 숫자로 구해진 요일을 통해 6이하 일경우 공백을 출력한다.
        if (startDay < 7) {
            for (int i=0; i<startDay; i++) {
                System.out.print("\t");
            }
        }

        int date = 1;
        int idx = startDay;
        while (date <= fullDate) {
            System.out.printf("%02d\t", date);
            date++;
            idx++;
            if (idx % 7 == 0) System.out.println();
        }
    }
}
