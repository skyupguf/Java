// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person { // 추상 메서드가 없는 경우 에러
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Abstract {
    public static void main(String[] args) {
//        추상 클래스의 사용
//        Person p1 = new Person(); // 기능이 없는 추상 클래스를 바로 객체로 만들 수 없다.
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override // 익명 클래스로 추상 클래스에 접근할 수 있다.
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();
    }

}
