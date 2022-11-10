// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

    public abstract int compute2(int x, int y);
}



public class Lambda {

    public static void main(String[] args) {

        ComputeTool c1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }

            public int compute2(int x, int y) {
                return x - y;
            }
        };
        System.out.println(c1.compute(1, 2));
        System.out.println(c1.compute2(1, 2));

        // 람다식
//        문제. 왜 람다식은 인터페이스 추상메서드가 두 개 이상일 때 사용이 제한되는가?
//        ComputeTool c2 = (x, y) -> { return x + y; }; // 인터페이스에 추상메서드가 2개이상일 경우 사용제한
//        System.out.println(c2.compute(1, 2));
    }
}
