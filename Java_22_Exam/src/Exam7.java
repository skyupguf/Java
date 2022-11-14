/*
* 로직작성
*   당첨번호를 제외하고 모든 회 수와 상관없이 로또번호는 중복이 되어선 안된다.
*   생성하는 로또의 번호를 해쉬셋으로 중복생성되지 않도록 난수로 생성한다.
*   모든 로또번호를 생성하고 해쉬셋을 루프하면서  
*   
* */

import java.util.*;

public class Exam7 {
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");

        int count = Math.min(sc.nextInt(), 10) * 6;
        Random ran = new Random();

        HashSet<Integer> numbers = new HashSet<Integer>();
        while (numbers.size() <= count) {
            numbers.add(ran.nextInt(45)+1);
        }

//        char index = 'A';
//        HashMap<Character, Object> map = new HashMap<>();
//        for (int number : numbers) {
//            if
//        }


//        해당 키의 배열을 루프하면서 로또번호와 비교해 존재하는 경우 confirm을 1씩 누적한다.

        
    }
}
