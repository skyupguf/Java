package D_Inheritance;

public class Test {
    public static void main(String[] args) {
        People people1 = new People();
        people1.name = "김코딩";
        System.out.println(people1.name);

//      A-3. Employee 가 People 클래스에 선언된 name 필드를 상속하므로 기본생성자로 생성할 수 있다.
        Employee employee1 = new Employee();
        employee1.name = "박해커";
        System.out.println(employee1.name);

        System.out.println("=====================");

//      B-3. 두 객체는 메서드가 상속되지 않았으므로 다른 결과값을 출력한다.
        Vehicle vehicle1 = new Vehicle();
        vehicle1.topSpeed = 100;
        vehicle1.size = 2;
        vehicle1.inform();

//      하위 클래스에서 선언된 name 과 displacement 는 Vehicle 클래스의 inform 메서드로 출력되지 않는다.
        Car car1 = new Car();
        car1.name = "차량";
        car1.topSpeed = 110;
        car1.size = 4;
        car1.displacement = 50;
        car1.inform();

//      B-4. 메서드를 상속하여 새로 정의한 Car2는 하위 클래스에서 입력한 값을 정상적으로 출력한다.
        Car2 car2 = new Car2();
        car2.name = "차량";
        car2.topSpeed = 110;
        car2.size = 4;
        car2.displacement = 50;
        car2.inform();
    }
}
