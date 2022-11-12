/**
//  접근방법  //

    각 타입별로 접근 방법을 나눈다.

    Type1
    n의 수 만큼 행과 별의 개수가 결정된다, n이 3이면 3행 3열의 별이 출력되면 된다.
        1-1. 1행 마다 n번의 별을 출력하면 되므로 이중 for 문을 통해 별을 출력한다.

    Type2
    1부터 n 행까지 별을 행이 바뀔 때 1개씩 늘려서 출력하면 된다.
        2-1. 이중 for 문의 j를 i+1 까지만 별이 출력되도록 하면 된다.

    Type3
    하나의 행이 n까지 출력되데 공백이 n - j, 별이 j 개가 출력되도록 하면 된다.
        3-1. i를 n-1부터 시작하여 j보다 클 경우 공백 아니면 *을 출력하게 한다.

    Type4
    n행일 경우 마지막 행의 별이 n * 2개 만큼 출력 되어야 한다.
        4-1. 우선 type3처럼 i가 더 큰 경우는 공백을 출력해 준다.
        4-2. 행이 하나 증가할 수록 출력되는 별의 개수도 1개씩 더 증가한다.
        4-3. n + (n - 1 - i) 만큼 j를 루프해서 별을 출력한다.

    Type5
    두 개의 for 문으로 정삼각형과 역삼각형을 나누어서 출력한다.
        5-1. n을 나눈 몫 n1과 n - n1을 한 n2로 나눠서 출력한다.
        5-2. 이 때, 줄을 맞추기 위해서 n1은 공백 문자를 하나 더 출력한다.
*/

public class Practice4 {
    public static void solution(int n, int type) {
        switch (type) {
            case 1 : type1(n);
            break;
            case 2 : type2(n);
            break;
            case 3 : type3(n);
            break;
            case 4 : type4(n);
            break;
            default: type5(n);
        }
    }
    public static void type1(int n) {
        System.out.println("== Type1 ==");

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type2(int n) {
        System.out.println("== Type2 ==");

        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type3(int n) {
        System.out.println("== Type3 ==");

        for (int i=n-1; i>=0; i--) {
            for (int j=0; j<n; j++) {
                if (i > j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type4(int n) {
        System.out.println("== Type4 ==");

        for (int i=n-1; i>=0; i--) {
            for (int j=0; j<n+(n-1-i); j++) {
                if (i > j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void type5(int n) {
        System.out.println("== Type5 ==");

        int n1 = n / 2;
        int n2 = n - n1;

        for (int i=n1; i>0; i--) {
            for (int j=0; j<=n1+(n1-i); j++) {
                if (i > j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<n2; i++) {
            for (int j=0; j<n2+(n2-1-i); j++) {
                if (i > j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        solution(5, 1);
        solution(5, 2);
        solution(5, 3);
        solution(5, 4);
        solution(7, 5);
    }
}