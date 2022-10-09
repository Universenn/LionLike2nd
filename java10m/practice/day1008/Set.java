package lionlike.java10m.practice.day1008;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        System.out.println(set1);

        HashSet<Integer> instersection = new HashSet<>(set1); // set1으로 instersection 객체 생성
        System.out.println(instersection);
        instersection.retainAll(set2);  // 교집합
        System.out.println(instersection);
        instersection.addAll(set2); //합집함
        System.out.println(instersection);
        instersection.removeAll(set1); //차집합
        System.out.println(instersection);

        HashSet<String> num = new HashSet<>();
        num.add("하나");
        num.add("둘");
        num.add("셋");
        num.add("하나");

        System.out.println(num);

    }
}
