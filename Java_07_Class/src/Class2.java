// Java 프로그래밍 - 클래스와 객체_2

import car.Car5;

class Car3 {
    String name;
    String type;

    Car3 (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo () {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현
    public void printCarInfo (String date, int carNum) {
        this.printCarInfo();
        System.out.println("date = " + date);
        System.out.println("carNum = " + carNum);
    }
}


class Car4 {
    // 스태틱 변수
    static String name = "none";
    String type;

    Car4 (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo () {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName () {
        System.out.println(name);
    }
}


public class Class2 {

    public static void main(String[] args) {
        Car3 myCar1 = new Car3 ("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022", 1234);

//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car5 myCar2 = new Car5("a", "b", "c", "d");
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);

//      3. Static
        System.out.println("=== Static ===");
        Car4.getName();
        Car4 myCar4_1 = new Car4("a", "sedan");
        Car4 myCar4_2 = new Car4("b", "suv");
        Car4 myCar4_3 = new Car4("c", "rv");
        // static 으로 설정된 변수는 하나의 변수를 공유하기 때문에 마지막 객체 "c"가 모두 반영된다.
        myCar4_1.printCarInfo();
        myCar4_2.printCarInfo();
        myCar4_3.printCarInfo();
    }

}
