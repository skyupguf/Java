package D_Inheritance;
//  필드와 메서드 상속
public class Vehicle {
    public String name = "기본";
    public double topSpeed;
    public int size;

//  B-9. 기본 생성자외 생성자를 정의할 경우 해당 클래스에선 기본 생성을 안하면 되지만 상속받는 하위 클래스는 기본 생성을 물려받지 못한다.
//  따라서, 정의된 생성자 추가시 상위클래스라면 반드시 기본 생성자를 표시해 준다.
    public Vehicle() {
        System.out.println("Vehicle 생성자");
    }

//  B-8. 해당 생성자가 없을 경우 Car2에서 두 인자를 활용한 생성자를 만들 수 없다.
    public Vehicle(double topSpeed, int size) {
        this.topSpeed = topSpeed;
        this.size = size;
    }
    public void inform() {
        System.out.println("차량이름 : " + name);
        System.out.println("최대속도 : " + topSpeed);
        System.out.println("정원 : " + size);
    }
}

//  B-1. 상위클래스 Vehicle 의 메서드를 상속하지 않으며, name 을 재선언한다.
class Car extends Vehicle {
    public String name;
    public int displacement;
}

//  B-2. 상위클래스 메서드를 오버라이드 하면서 새로운 메서드를 정의할 수 있다.
//  B-3. super 는 상위클래스 가리키는 키워드, this 는 현재클래스를 가리키는 키워드
class Car2 extends Vehicle {
    public String name;
    public int displacement;

//  B-6. 상속받은 클래스는 기본 생성자와 마찬가지로 설정하지 않으면 자바 컴파일러가 default 를 제공한다.
    public Car2() {
        super();
        System.out.println("Car2의 생성자");
//        super();  상위 클래스 생성자는 최상단에 위치해야 한다.
    }

//  B-7. super 로 상위 클래스 생성자를 사용하기 위해선 상위 클래스에서 정의된 생성자가 존재해야 한다.
//  topSpeed 와 size 인자를 사용한 생성자가 Vehicle 에 정의되어 있어야 한다.
    public Car2(double topSpeed, int size, String name, int displacement) {
//      super 를 활용한 기본 사용법
//        super.topSpeed = topSpeed;
//        super.size = size;
//      한 번에 표현할 수 있다.
        super(topSpeed, size);
        this.name = name;
        this.displacement = displacement;
    }

    @Override
    public void inform() {
//      동일한 변수명을 가진 name 을 super 와 this 로 구분해 출력할 수 있다.
        super.inform();
        System.out.println("자동차 이름 : " + this.name);
        System.out.println("배기량 : " + displacement);
    }
}
