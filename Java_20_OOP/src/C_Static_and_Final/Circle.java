package C_Static_and_Final;

class Circle {
//  static
//  A-1. 정적필드, 메서드를 선언할 때 사용하는 지정자(키워드) 이다.
//  A-2. 클래스에 소속된 저장공간이 하나만 존재하는 변수로 생성한 객체에는 저장공간이 없다.

//  원의 넓이를 구할 때 반지름과 파이가 필요한데, pi의 경우 정적 필드 이므로 객체 생성으로 매번 8비트의 double 을 메모리에 저장할 필요없다.
//  이 때, static 정적 지정자를 사용할 경우 class 가 메모리에 기록될 때 해당 동시에 메모리에 할당되도록해 한 번만 참조하도록 한다.
    double radius;
//  정적필드의 변수는 대문자를 사용해 구분해준다.
    static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 원의 넓이
    public double getArea() {
        return PI * radius * radius;
    }

    // 원의 둘레
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}

class Calender {
//  final
//  B-1. 지역 변수의 상수를 할당하기 위한 지정자(키워드) 이다.
//  B-2. 클래스내에서 값을 할당하든 생성자를 만들고 객체 생성시 값을 할당하든 변수에 이미 값이 할당되어 있으면 재할당을 할 수 없다.
//  B-3. static 과 같이 사용될 수 있다.

//  클래스내에서 값 할당할 경우라면 static 을 같이 사용하자, 어차피 변동되지 않은 상수이므로 객체 메모리를 소비할 필요가 없다.
//    public static final int LAST_MONTH = 12;

//  값을 할당하지 않을 경우 생성자로 명시해 줘야 사용할 수 있다.
    public final int LAST_MONTH;

    public Calender(int month) {
        this.LAST_MONTH = month;
    }
}
