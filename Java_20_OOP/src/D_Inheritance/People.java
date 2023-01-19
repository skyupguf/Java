package D_Inheritance;
//  상속 (Inheritance)
//  하위 클래스가 상위 클래스의 필드와 메서드를 물려받는 계층 구조를 가진 기능

//  사람 - 학생 - 장학생
//      - 교직원 - 교수
//              - 직원
//  하위인 교수, 직원은 교직원의 특성을 두모 물려 받을 수 있다.
//  교직원은 사람이므로 교직원은 사람이라는 상위 클래스의 하라위는 것을 추상화할 수 있다.

//  상속하는 상위클래스 : 부모, 슈퍼, 기본 클래스
//  상속받는 하위클래스 : 자식, 서브, 유도, 파생 클래스

//  extends
//  A-1. class 를 상속하는 키워드
public class People {
    public String name;
}

//  A-2. People 에서 상속가능한 필드와 메서드를 상속해 온다.
class Employee extends People {
}