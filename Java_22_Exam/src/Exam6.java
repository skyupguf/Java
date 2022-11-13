/*
* 로직 작성
*   한 번의 루프가 투표 1회로 총 1만 번의 루프를 한다.
*   후보 배열에 4명의 후보를 삽입하고 배열의 인덱스가 해당 후보의 기호가 된다.
*   투표 배열에 한 번의 투표가 될 때 마다 카운트해 갱신한다.
*
*   핵심은 투표수를 4개의 배열값에 동일하지 않지만 비슷한 비율로 카운트시켜야 한다.
*   1. 하나의 값의 상한선을 25,50 정도로 설정해 해당 수가 최대치가 되면 난수 카운트에서 제외하는 방식을 사용한다.
*
*   출력할 정보
*   1. 현재 투표자와 투표비율을 표시하고 이번 루프에 투표된 후보를 이름으로 출력한다.
*   2. 인덱스 0+1로 기호를 표시하고 해당 인덱스 후보이름을 출력한다.
*   3. 해당 후보 투표와 전체투표로 비율을 구해 표시하고 투표 수룰 출력한다.
*   4. 투표가 완료되면 최다 득표자를 배열에서 찾아 출력한다.
* */

import java.util.Random;

public class Exam6 {
    public static void main(String[] args) {

//      1. 득표 수, 현재 투표수 대비 비율, 후보를 기호 순으로 배열에 각 타입에 맞게 삽입한다.
        int [] votes = {0, 0, 0, 0};
        double [] ratio = new double[4];
        String [] candidates = {"이재명", "윤석열", "심상정", "안철수"};

//      2. 랜덤값 발생을 위한 Random 클래스와 각 투표타임에 정해질 후보넘버를 선언한다.
        Random ran = new Random();
        int voteNum = 0;

//      3. 총 10000번의 투표를 하며 i가 현재 투표 수가 된다.
        for (int i=1; i<=10000; i++) {
            boolean overCheck = true;

//          4. 비슷한 비율로 랜덤값을 증가시키기 위해 특정 기호의 표수가 2550을 넘으면 랜덤기호를 재생성한다.
            while (overCheck) {
                voteNum = ran.nextInt(4);
                if (votes[voteNum] < 2550) overCheck = false;
            }
            votes[voteNum]++;

//          5. 전체 투표와 투표율을 계산해 출력한다.
            double voteRatio = (double)i / (double)10000 * 100.0;
            System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", voteRatio, i, candidates[voteNum]);

//          6. 개별 후보의 득표율을 계산하고 득표 수와 기타 정보를 출력한다.
            for (int j=0; j<4; j++) {
                ratio[j] = votes[j] / (double)i * 100.0;
                System.out.printf("[기호:%d] %s: %05.2f%%, (투표수: %d)\n", j+1, candidates[j], ratio[j], votes[j]);
            }
        }

//      7. 가장 많은 득표자를 votes 배열을 루프하면서 비교해 당선인을 출력한다.
        int result = 0;
        for (int i=0; i<4; i++) {
            if (votes[result] < votes[i]) result = i;
        }
        System.out.printf("[투표결과] 당선인: %s", candidates[result]);
    }
}
