package lionlike.java11m.week1.day1031;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PrHashSet {

    public int[] lotto() {
        int[] arr = new int[6];

        HashSet<Integer> loto = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*45+1);
        }

        for (int i : arr) {
            loto.add(i);
        }
        System.out.println(loto);

        return arr;
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
