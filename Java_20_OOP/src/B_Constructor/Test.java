package B_Constructor;

public class Test {
    public static void main(String[] args) {

//      A-3. 생성자는 클래스를 생성하고 필드를 선언했을 경우 객체를 생성할 때 기본 생성자로 생성이 된다.
//      A-4. 클래스내 생성자가 존재하면 기본 생성자를 선언해야 기본 생성이 가능하다.

        // 생성자가 클래스내에 존재하면 기본 생성자는 작동하지 않는다.
//      Student student1 = new Student();
//      student1.name = "김코딩";

        // 클래스내 존재하는 생성자 형식대로 객체를 생성헤야하며, 기본 생성자를 추가 선언해 기본 생성을 할 수 있다.
        Student student = new Student("김코딩");
        System.out.println(student.name);

        //
        System.out.println("======================");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("김코딩");
        Employee employee3 = new Employee("이수도", 20);
        Employee employee4 = new Employee("박검증", 21, "남");
        Employee employee5 = new Employee("오에러", 22, "여", "인사과");
        Employee employee6 = new Employee("한검토", "남");

        System.out.println(employee2.name);
        System.out.println(employee3.name + " " + employee3.age);
        System.out.println(employee4.name + " " + employee4.age + " " + employee4.sex);
        System.out.println(employee5.name + " " + employee5.age + " " + employee5.sex + " " + employee5.department);
        System.out.println(employee6.name + " " + employee6.sex);
    }
}
