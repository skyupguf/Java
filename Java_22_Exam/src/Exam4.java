import java.util.Random;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = Integer.toString(sc.nextInt());

        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = Integer.toString(sc.nextInt());

        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = Integer.toString(sc.nextInt());

        sc.nextLine();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String sex = sc.nextLine();
        if (sex.equals("m") || sex.equals("M")) sex = "3";
        else if (sex.equals("f") || sex.equals("F")) sex = "4";

        Random ran = new Random();
        char [] randomNum = new char[6];
        for (int i=0; i<6; i++) {
            randomNum[i] = Character.forDigit(ran.nextInt(9), 10);
        }
        System.out.println(year + month + day + '-' + sex + String.valueOf(randomNum));
    }
}
