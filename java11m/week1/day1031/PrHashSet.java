package lionlike.java11m.week1.day1031;

import java.util.*;

public class PrHashSet {

    public int[] lotto() {
        int[] arr = new int[6];

        HashSet<Integer> loto = new HashSet<>();

        for (int i = 0; loto.size() < 6; i++) {
            loto.add((int)(Math.random()*45+1));
        }

        System.out.println(loto);

        // 오름차순 정렬
        List list = new LinkedList(loto);
        Collections.sort(list);
        System.out.println(list);

        return new int[0];
    }

    public static void main(String[] args) {
        Object[] objects = {1,"1",2,2,3,3,3,4,4};
        HashSet<Object> obArr = new HashSet<>();
        for (int i = 0; i < objects.length; i++) {
            obArr.add(objects[i]);
        }
        System.out.println(obArr);

        for (Object o : obArr) {
            System.out.println(o);
        }

        PrHashSet phs = new PrHashSet();
        System.out.println(Arrays.toString(phs.lotto()));
    }
}
