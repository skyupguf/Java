// Java 프로그래밍 - 반복문

public class Loop {
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");

//      1-1. 기본 사용 방법
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }

        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//      continue 로 한 번의 루프를 뛰어 넘는다.
        for (int i=0; i<5; i++) {
            if (i == 1) continue;

            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//      break 로 해당 조건에 도달했을 때 루프를 종료시킨다.
        for (int i=0; i<5; i++) {
            if (i == 4) break;

            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//      1-2. for each
        System.out.println("== for each ==");
        int[] nums = {1, 2, 3, 4, 5};
        for (int i : nums) System.out.println(i);

//      2. 반복문 - while
        System.out.println("== while ==");

//      2-1. while
        int i = 0;
        while (i < 3) {
            System.out.println(i++);
        }
        System.out.println();

        while (i < 3) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println(i++);
        }

        while (i < 3) {
            if (i == 2) break;
            System.out.println(i++);
        }

//      2-2. do-while
        System.out.println("== do-while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);

//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
        System.out.println("== Q1 ==");
//      *
//      ***
//      *****
//      *******

        for (int j=1; j<8; j++) {

            if (j%2 == 1) {
                for (int k=0; k<j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
/*
        추가. 아래와 같은 다양한 모양을 순서대로 직접 코딩해 보자.
            *       *****       *****       *
           **        ****       ****       ***       *******
          ***         ***       ***       *****       *****
         ****          **       **       *******       ***
        *****           *       *       *********       *
*/
        System.out.println("== Q1-1 ==");

        for (int j=4; j>=0; j--) {
            for (int k=0; k<5; k++) {
                if (j <= k) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("== Q1-2 ==");

        for (int j=0; j<5; j++) {
            for (int k=0; k<5; k++) {
                if (j > k) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("== Q1-3 ==");

        for (int j=5; j>0; j--) {
            for (int k=0; k<j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("== Q1-4 ==");

        for (int j=0; j<5; j++) {
            for (int k=0; k<4-j; k++) {
                System.out.print(" ");
            }
            for (int l=0; l<2*j+1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j=0; j<4; j++) {
            for (int k=0; k<j+1; k++) {
                System.out.print(" ");
            }
            for (int l=0; l<7-2*j; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        System.out.println("== Q2 ==");

        int waterTemperature = 1;
        while (waterTemperature <= 100) {
            if (waterTemperature % 10 == 0) {
                System.out.print(waterTemperature + "도 입니다.");
                System.out.println();
            }
            waterTemperature++;
        }
    }
}