package D_Inheritance;

public class Vehicle {
    public String name = "기본";
    public double topSpeed;
    public int size;

    public void inform() {
        System.out.println("차량이름 : " + name);
        System.out.println("최대속도 : " + topSpeed);
        System.out.println("정원 : " + size);
    }
}
//  필드와 메서드 상속
//  B-1. 상위클래스 Vehicle 의 메서드를 상속하지 않으며, name 을 재선언한다.
class Car extends Vehicle {
    public String name;
    public int displacement;
}

//  B-2. 상위클래스 메서드를 오버라이드 하면서 새로운 메서드를 정의할 수 있다.
class Car2 extends Vehicle {
    public String name;
    public int displacement;

    @Override
    public void inform() {
//      동일한 변수명을 가진 name 을 super 와 this 로 구분해 출력할 수 있다.
        super.inform();
        System.out.println("자동차 이름 : " + this.name);
        System.out.println("배기량 : " + displacement);
    }
}

class Train extends Vehicle {

}