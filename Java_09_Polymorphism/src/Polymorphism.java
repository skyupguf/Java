// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();
        Person p2 = new Student();
        Person p3 = new CollegeStudent();
//        Student s2 = new Person(); // 자식클래스에서 부모객체로 접근은 불가능하다.
//        CollegeStudent c1 = new Student(); // 같은 부모여도 직접 상속관계 아니므로 불가능 하다.

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2(); //부모클래스에서 오버라이딩된 메서드만 접근이 가능하다.

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅(자식 클래스 객체가 부모 클래스 객체로 형변환)이라고 부름

        pp1 = pp2;
        pp1 = ss2;
        ss1 = ss2;
//        ss1 = pp2;
        ss1 = (Student)pp3; // 다운캐스팅(부모타입에서 다시 자기 클래스로 변환)

        CollegeStudent cc1;
        CollegeStudent ccs2 = new CollegeStudent();
//        ss1 = cc2; // 형제 클래스들은 마찬가지로 형변환이 안된다.
//        cc1 = ss2;

//      3. instanceof // 다형성이 적용가능한지 확인을 해준다.
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);

        if (pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

    }
}