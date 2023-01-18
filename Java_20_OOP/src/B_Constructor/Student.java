package B_Constructor;

class Student {
    public String name;

//  생성자
//  A-1. 객체가 생성될 때 필요한 작업을 수행하는 특별한 메서드로 주로 객체 필드에 초기 값을 할당하거나 초기화 작업을 수행하기 위해 사용된다.
//  A-2. 반환타입을 선언할 필요(X), 접근 지정자 public, 싱글톤패턴처럼 private, protected 를 사용하기도 한다.

//    public Student() {
//        System.out.println("추가한 생성자 호출");
//    }

    // 커스텀 생성자 추가시 자바 기본 생성자는 작동하지 않는다. 만일 위의 생성자를 주석처리하면, 기본생성자가 작동하지 않는다.
    public Student(String name) {
        System.out.println("이름 매개변수를 추가한 생성자 호출");
        this.name = name;
    }
}

class Employee {
    public String name;
    public int age;
    public String sex;
    public String department;

    public Employee() {
        System.out.println("기본 생성자");
    }

    public Employee(String name) {
        this.name = name;
    }

//  this 생성자
//  B-1. 구현된 자기 자신의 다른 생성자를 호출하는 문장으로 두 줄 사용은 불가능 하다.
    public Employee(String name, int age) {
        this(name);
        this.age = age;
    }

    public Employee(String name, int age, String sex) {
        this(name, age);
        this.sex = sex;
    }

    public Employee(String name, int age, String sex, String department) {
        this(name, age, sex);
        this.department = department;
    }

//  생성자 오버로딩
//  C-1. 동일한 메서드에 다른 인자 패턴을 사용할 경우 허용되는 문법이다. Java 는 타입을 통해 시그니처를 파악한다.
    // 동일한 타입의 매개변수로 지정된 메서드의 경우 중복처리가 되어 하나만 사용할 수 있다.
    public Employee(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    // 앞서 선언된 동일한 패턴대로 인자 타입을 오버로딩하면 중복처리 에러가 발생한다.
//    public Employee(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }
}