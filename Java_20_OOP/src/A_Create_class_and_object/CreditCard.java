package A_Create_class_and_object;

//  클래스와 필드 구현
//  A-1. 신용카드를 만드는 틀인 class 를 생성하고 외부에서 접근 가능한 클래스의 필드를 생성한다.
//  A-2. 카드 구현에 있어서 실생활에서 필요한 정보들을 class 로 추상화하여 카드넘버와 카드소유주라는 필드를 생성한다.
//  A-3. 필드는 각각 카드넘버와 카드 소유주가 되겠다. 해당 필드들은 외부에 접근이 가능해야 하므로 public 으로 선언한다.
public class CreditCard {

//  필드 기본값
//  B-1. 클래스의 멥버변수는 지역변수와 달리 기본값들을 가진다.
//  B-2. 자료형에 따라 false, '\0', 0, (float)0.0f, (double)0.0, null
    private long cardNumber;
    public String cardOwner;

//  객체생성, 필드참조 연산자
//  C-1. 생성한 신용카드 클래스를 이용해 CreditCardTest 로 객체를 생성해 본다.

//  메소드 구현
//  D-1. 메소드 추상화 : 카드사용, 카드비용지급, 포인트적립
//  D-2. 메소드를 통해 총 카드사용 비용과 총 포인트 적립 필드가 필요함을 알 수 있다.
    // 사용된 금액과 금액에 맞춰 적립할 포인트를 추상화한다.
    public long totalUsed;
    public long point;

    // 카드가 사용될 때 사용된 총 금액을 총 비용에 누적한다.
    public void useCard(long usedCost) {
        totalUsed += usedCost;
    }

    // 카드사용비용에서 지불된 금액을 차감하고 비용이 지불되었으면 특정비율로 포인트를 누적한다.
    public void payBill(long payment) {
        totalUsed -= payment;
        earnPoint(payment);
    }

    // 카드를 사용시 포인트를 누적한다. 누적포인트의 경우 외부에 조회될 필요가 없는 정보이므로 캡슐화 이론에 따라 접근 제한을 한다.
    private void earnPoint(long payment) {
        point += payment * 0.01;
    }

//  필드 참조 메서드
//  E-1. setter : private 으로 지정된 필드에 객체 생성시 값을 셋하기 위한 메서드
//  E-2. getter : private 으로 지정된 필드에 객체 생성시 값을 리턴할 메서드
    // cardNumber 를 private 로 변경해서 적용해보자.
    // 가장 일반적으로 setter 와 getter 의 경우 검증의 용도로 사용될 수 있다.
    public void setCardNumber(long cardNumber) {
        if (cardNumber < 1000_000_0000L) {
            System.err.println("형식에 맞는 카드번호를 입력해주세요.");
        }
        this.cardNumber = cardNumber;
    }
    // 카드 번호를 외부에 출력시키지 않도록 설정할 수 있다.
    public long getCardNumber() {
        return 0;
    }
}