import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        int[] arr = {1,1,3,3,0,1,1};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);

        int[] answer = new int[set.size()];
        int i = 0;
        for (int el : set) {
            answer[i++] = el;
        }
        System.out.println(answer[0]);
    }
}