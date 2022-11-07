// Java 프로그래밍 - 자료형_3

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class DataType3 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

//      1-1. add
        l1.add(1);
        l1.add("a");
        l1.add(0, 0);
        l1.add("bb");
        l1.add("cc");
        System.out.println("l1 = " + l1);

//      문제점. Array 와 ArrayList 는 형태가 다른가 어떤 차이가 존재할까?
//      1. l1[2] = 2; 와 같이 Array 처럼 인덱스로 값을 변경할 수 없다.
//      2. Array 는 출력이 객체로 표현되지만 ArrayList 는 배열을 출력해준다. 왜 그럴까?

//      1-2. get
        System.out.println(l1.get(0));

//      1-3. size
        System.out.println(l1.size());

//      1-4. remove
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        l1.remove(Integer.valueOf(1));
        System.out.println("l1 = " + l1);
        
//      문자와 문자열의 경우 그냥 지워주면 값을 찾아서 지운다.
        l1.remove("a");
        System.out.println("l1 = " + l1);
        l1.remove("bb");
        System.out.println("l1 = " + l1);

//      1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1);

//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(3);
        l2.add(1);
        l2.add(0);
        l2.add(2);
        System.out.println("l2 = " + l2);
        
        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 = " + l2);
        
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);

//      1-7. contains
        System.out.println(l2.contains(0));

//      2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

//      2-1. put
        map.put("apple", 1000);
        map.put("banana", 600);
        System.out.println("map = " + map);

//      2-2. get
        System.out.println(map.get("apple"));
        System.out.println(map.get("orange"));

//      2-3. size
        System.out.println(map.size());

//      2-4. remove
        System.out.println(map.remove("apple"));
        System.out.println(map.remove("orange"));
        System.out.println("map = " + map);

//      2-5. containsKey
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("banana"));

//      3. Generics
        System.out.println("== Generics ==");
        ArrayList<String> l3 = new ArrayList<String>();
//      l3.add(0); 문자열로 제한되어 있으므로 에러가 난다.
        l3.add("a");
        System.out.println("l3 = " + l3);

        HashMap<String, Integer> map2 = new HashMap<>();
//      map2.put(0, "a"); 자료형에 맞는 키 밸류를 설정해야 한다.
        map2.put("a", 0);
        System.out.println("map2 = " + map2);
    }

}
