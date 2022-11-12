/**
 //  접근방법  //

    두 개의 벽 중 더 작은 벽이 최대 높이의 기준이 된다.
    따라서, 한 쪽 벽을 고정하면 다른 한 쪽 벽이 아무리 높아도 가장 멀리 떨어진 벽 부피보다 커질 수 없다.
    그래서 일일이 for 문을 통해 모든 경우의 부피를 구할 필요가 없다.
    두 벽을 비교했을 때 더 작은 쪽의 벽을 당겨서 부피를 구해나가면 가장 큰 부피를 쉽게 구할 수 있다.

    1. 인덱스 역할을 할 left 와 right 를 선언하고 0과 마지막 인덱스를 할당한다.
    2. 부피를 구해 size 에 할당한다.
    3. left 인덱스와 right 인덱스가 같지 않을 때 까지 비교를 한다.
    4. 두 위치의 값을 곱해 size 와 비교하고 더 클 경우 할당한다.
    5. 두 위치의 값을 비교해 더 작은 쪽의 인덱스를 left 면 +1, right 면 -1을 해 갱신한다.
 */
public class Practice5 {
    public static int solution(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left != right) {
            int distance = right - left;
            int size = distance * Math.min(height[left], height[right]);
            max = Math.max(max, size);

            if (height[left] <= height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}