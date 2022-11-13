import java.util.Scanner;

/**
 * 접근 방법
 *
 * 캐시백의 조건설정
 * 결제 금액의 10%를 적립하며 단위는 100원단위 이므로 10원 이후부터 버리고 1000원이상 발생해야 캐쉬백이 된다.
 * 또한 건당 최대 300원을 넘어설 수 없으므로 3000원이상은 모두 300원이 된다.
 *
 */

public class Exam2 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int pay = sc.nextInt();
        double cashBack = pay * 0.1;

        if (cashBack >= 300) cashBack = 300;
        else if (cashBack >= 200) cashBack = 200;
        else if (cashBack >= 100) cashBack = 100;
        else cashBack = 0;

        System.out.printf("결제 금액은 %d원이고, 캐시백은 %.0f원 입니다.", pay, cashBack);
    }
}
