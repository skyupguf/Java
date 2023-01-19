package C_Static_and_Final;

public class Test {
    public static void main(String[] args) {
//      A-3. static 은 객체생성을 하지 않아도 클래스에 소속되어 메모리에 할당되므로 참조가 가능하다.
//      클래스에서 바로 참조가 가능
        System.out.println(Circle.PI);
//      radius 는 정적필드가 아니므로 객체 생성이후 객체 소속의 메모리에 할당된다.
//        System.out.println(Circle.radius);

        Circle circle1 = new Circle(10);
        System.out.println("원의 넓이 : " + circle1.getArea());
        System.out.println("원의 둘레 : " + circle1.getPerimeter());
//      정적필드는 객체생성을 해도 일반 필드처럼 참조할 수 있다.
        System.out.println(circle1.PI);

//      B-4. final 로 선언시 한 번 변수에 할당된 값은 재할당할 수 없다.
        Calender calender1 = new Calender(12);
//      final 로 지정되어 있으므로 값 재할당시 에러
//        calender1.LAST_MONTH = 13;

        System.out.println("===================");
//      C-4. 객체 생성시 초기화 순서확인
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();

    }
}
