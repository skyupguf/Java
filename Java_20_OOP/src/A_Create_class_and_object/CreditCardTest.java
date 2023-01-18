package A_Create_class_and_object;

public class CreditCardTest {
    public static void main(String[] args) {

//      C-2. myCard 변수에 new 생성자로 CreditCard 클스래의 객체를 생성한다.
        // myCard 는 생성한 객체가 할당된 메모리위치를 저장한다.
        // 참조형 타입인 cardOwner 가 가리키는 위치에 값이 존재한다.
        CreditCard myCard = new CreditCard();

//      E-3. private 인 필드에 직접 접근할 수 없으므로 setter 함수를 활용한다.
//      myCard.cardNumber = 1234_5678_1234_1234L;
        myCard.setCardNumber(1234_5678_1234_1234L);
        myCard.cardOwner = "김코딩";

//      E-4. private 인 필드에 직접 접근할 수 없으므로 getter 함수를 활용한다.
//      System.out.println(myCard.cardNumber);    private 인 필드에 직접 접근할 수 없으므로 getter 함수를 활용한다.
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.totalUsed);
        System.out.println(myCard.point);

        myCard.useCard(10000);
        myCard.useCard(20000);
        myCard.useCard(30000);
        myCard.payBill(30000);
//      myCard.earnPoint    포인트 메서드는 private 지정자로 CreditCard 클래스내에서만 접근 할 수 있다.

        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.totalUsed);
        System.out.println(myCard.point);
    }
}
