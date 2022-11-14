
import java.util.*;
class Lotto {
    public ArrayList<Integer> AddLotto() {

        Random ran = new Random();

        HashSet<Integer> numbers = new HashSet<>();
        while (numbers.size() < 6) {
            numbers.add(ran.nextInt(45)+1);
        }

        ArrayList<Integer> lottoNum = new ArrayList<>(numbers);
        Collections.sort(lottoNum);
        return lottoNum;
    }

    public void PrintLotto(ArrayList<Integer> nums, int i) {

        String printLotto = "";
        char index = i >= 0 ? (char)(65 + i) : ' ';

        for (Integer num : nums) {
            if (num < 10) printLotto += ("0" + num + ",");
            else printLotto += (num + ",");
        }

        printLotto = printLotto.substring(0 , printLotto.length() - 1);
        System.out.printf("%s\t%s", index, printLotto);
    }
}


public class Exam7 {
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");

        int count = Math.min(sc.nextInt(), 10);
        Lotto generateLotto = new Lotto();

        ArrayList<Integer>[] lottos = new ArrayList[count];
        for (int i=0; i<count; i++) {

            ArrayList<Integer> lottoNum = new ArrayList<>(generateLotto.AddLotto());
            generateLotto.PrintLotto(lottoNum, i);
            System.out.println();

            lottos[i] = new ArrayList<>(lottoNum);
        }

        System.out.println();
        System.out.println("[로또 발표]");

        ArrayList<Integer> prize = new ArrayList<>(generateLotto.AddLotto());
        generateLotto.PrintLotto(prize, -1);

        System.out.println();
        System.out.println();
        System.out.println("[내 로또 결과]");

        for (int i=0; i<lottos.length; i++) {
            int check = 0;

            for (int j=0; j<prize.size(); j++) {
                if (lottos[i].get(j) == prize.get(j)) check++;
            }
            generateLotto.PrintLotto(lottos[i], i);
            System.out.printf(" => %d개 일치\n", check);
        }
    }

}
