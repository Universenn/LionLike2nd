package lionlike.java11m.week1.day1030;

import java.util.ArrayList;

public class PrGenerics {
    public static void main(String[] args) {
//        ArrayList<Tv> tvList = new ArrayList<Tv>();
//        Tv tv = new Tv();
//        tvList.add(tv); // 정상작동
//
//        tvList.add(new Tv()); // 정상작동
//        tvList.add(new letop()); // 컴파일 에러

        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(1);  // ok
        intlist.add(2);  // ok
        int a = (Integer)intlist.get(0);
//        int a = intlist.get(0);


//        intlist.add("3"); // 컴파일 에러

    }
}
