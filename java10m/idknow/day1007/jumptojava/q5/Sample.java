package lionlike.java10m.idknow.day1007.jumptojava.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;  // 둘이 현재 주소값이 같다.
//        ArrayList<Integer> b = new ArrayList<>(a); // 만약 독립적으로 생성하고싶음녀 다음과 같이 실행
        a.add(4);
        System.out.println(b.size());
    }
}

