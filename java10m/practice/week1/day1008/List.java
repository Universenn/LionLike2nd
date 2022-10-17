package lionlike.java10m.practice.week1.day1008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("안녕");
        sb.append(" 반가워");
        sb.append(" 잘가");
        System.out.println(sb);
        sb.insert(0,"삐용 ");
        System.out.println(sb.toString()); // 문자열 포메팅
        sb.substring(0,sb.length()-3);
        System.out.println(sb.substring(0,sb.length()-3)); // 문자열 포메팅

        String[] day = {"m","t","w","t","f","s","s"};
        System.out.println(Arrays.toString(day));
        System.out.println(day.length);

        // List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
        // 박찬호 선수가 총 3번의 투구를 138, 129, 142(km) 의 속도록 던졌다면 다음과 같이 코드를 작성할 수 있다.
        // 리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다

        ArrayList<Integer> speed = new ArrayList<>();
        speed.add(135);
        speed.add(130);
        speed.add(128);
        speed.add(148);
        speed.add(135); // 중복 가능
        System.out.println(speed);
        speed.add(0, 150);
        System.out.println(speed);
        System.out.println(speed.size());
        System.out.println(speed.contains(148));
        System.out.println(speed.contains(147));
//        System.out.println(speed.remove(148)); //  List는 객체를 삭제할수 없다?
        System.out.println(speed.remove(0));
        System.out.println(speed);


        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data)); // 배열을 리스트로 바꾸는 방법
        System.out.println(pitches);  // [138, 129, 142] 출력

        String result = "";
        for (int i =0; i<pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";
        }
        String re = result.substring(0,result.length()-1);
        System.out.println(re);

        String result1 = "";
        System.out.println(pitches); // 데이터 상태 확인
        result1 = String.join(",",pitches);
        System.out.println(result1);

        pitches.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(pitches);
        System.out.println(pitches.get(0)+1);
        pitches.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(pitches);


        String[] data1 = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        Arrays.sort(data1);
        System.out.println(Arrays.toString(data1));
        // 문자열로 된 숫자들이지만 오름차순 내림차순 구분이 가능.
    }
}
