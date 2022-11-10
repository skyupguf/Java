// Java 프로그래밍 - 내부 클래스

// 내부 클래스 구조
class Outer {
    public void print() {
        System.out.println("outer print");
    }
    class Inner {
        public void innerprint() {
            Outer.this.print();
        }
    }
    static class InnerStaticClass {
        void innerprint() {
//            Outer.this.print(); // 아우터 클래스가 static이 아니기 때문에 메모리에 없으므로 사용이 안된다.
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class InnerClass {

    public static void main(String[] args) {

//      외부 클래스
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();

//      내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Student.printInfo");
            }
        };

    }

}
