
import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        System.out.println("[과세금액 계산 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("연소득을 입력해 주세요.:");
        int income = sc.nextInt();

        int [][] taxChart = new int[8][];
        taxChart[0] = new int[]{12000000, 6, 0};
        taxChart[1] = new int[]{46000000, 15, 1080000};
        taxChart[2] = new int[]{88000000, 24, 5220000};
        taxChart[3] = new int[]{150000000, 35, 14900000};
        taxChart[4] = new int[]{300000000, 38, 19400000};
        taxChart[5] = new int[]{500000000, 40, 25400000};
        taxChart[6] = new int[]{1000000000, 42, 35400000};
        taxChart[7] = new int[]{1000000000, 45, 65400000};

        int temp = income;
        int cal = 0;
        int idx = 0;
        double tax = 0;
        double total = 0;

        for (int i=0; i<8; i++) {
            int nowTax = (i == 0 || i == 7) ? taxChart[i][0] : taxChart[i][0] - taxChart[i-1][0];

            cal = Math.min(temp, nowTax);
            tax = (double)taxChart[i][1] / (double)100 * cal;
            System.out.printf("%10d * %2d%% =%12.0f\n", cal, taxChart[i][1], tax);

            total += (int)tax;
            temp -= nowTax;
            idx = i;

            if (income <= taxChart[i][0]) break;
        }
        double total2 = (double)taxChart[idx][1] / (double)100 * income - taxChart[idx][2];

        System.out.println();
        System.out.printf("[세율에 의한 세금]: %18.0f\n", total);
        System.out.printf("[누진공제 계산에 의한 세금]: %11.0f", total2);
    }
}
