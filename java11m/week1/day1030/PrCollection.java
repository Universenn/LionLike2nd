package lionlike.java11m.week1.day1030;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrCollection {

    public static void main(String[] args) {
        // 기본 길이(용랴으 capacity)가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        // ArrayList 에는 객체만 저장 가능
        // 하지만 autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(new Integer(5));
        list1.add(51);
        list1.add(6);
        list1.add(71);
        // index 번째에 값 넣기
        list1.add(0,1);
        list1.add(8);
        list1.add(91);
        list1.add(10);
        list1.add(15);
//        System.out.println(list1);
        ArrayList list2 = new ArrayList(list1.subList(1,4));


        // ArrayList(Collection c)
        // index 으로 from 부터 to 까지 짤라서 read 해준다.
        List sub = list1.subList(1,4);
        ArrayList list3 = new ArrayList(sub);
//        System.out.println(list2);


//        System.out.println(list1);
        // 오름 차순 정렬
//        Collections.sort(list1);
//        System.out.println(list1);


        // list1이 list2의 모든 요소들을 가지고 포함하고 있는지 boolean 형태로 나타낸다.
        boolean a = list1.containsAll(list2);

//        System.out.println(a);


        // 값 변경
//        System.out.println(list1);
        list1.set(0,"안녕");
//        System.out.println(list1);

        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
//        System.out.println(list1.indexOf(51));


//        [안녕, 5, 51, 6, 71, 8, 91, 10, 15]
//        2
//        System.out.println(list1);
        list1.remove(0);
//        System.out.println(list1);
//        [안녕, 5, 51, 6, 71, 8, 91, 10, 15]
//        [5, 51, 6, 71, 8, 91, 10, 15]


        // list1이 list2를 포함하고 있는지 boolean 형태로 나타내고,
        // 또 list1 과 list2 가 겹치는 부분을 제외한 나머지를 삭재해준다.
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.retainAll(list2));
        System.out.println(list1);


//        [5, 51, 6, 71, 8, 91, 10, 15]
//        [5, 51, 6]
//        true
//        [5, 51, 6]


    }

}
