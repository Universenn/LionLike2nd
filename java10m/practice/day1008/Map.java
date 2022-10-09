package lionlike.java10m.practice.day1008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> size = new HashMap<>();
        size.put("우주완", 100);
        size.put("김주완", 80);
        size.put("이주완", 200);
        size.put("환주완", 170);
        size.put("게주완", 150);
        size.put("게주완", 150); // 중복 불가
        size.put("게주완", 200); // 중복 불가 마지막꺼 사용

        System.out.println(size);
        System.out.println(size.get("우주완"));
        System.out.println(size.getOrDefault("우주완",222)); // 있으면 안뜸
        System.out.println(size.getOrDefault("이지우",222)); // 없으면 default 값 설정
        System.out.println(size.containsKey("우주완"));
        System.out.println(size.containsKey("이지우"));
        System.out.println(size.remove("이지우")); // key 값이 없을시 null
        System.out.println(size);
        System.out.println(size.remove("우주완")); // 삭재후 value 값 출력
        System.out.println(size.size()); //
        System.out.println(size.keySet());  // key 값만 리턴

        List<String> keyList = new ArrayList<>(size.keySet()); //?
        System.out.println(keyList);

    }

}
