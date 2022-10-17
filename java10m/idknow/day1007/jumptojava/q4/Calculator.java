package lionlike.java10m.idknow.day1007.jumptojava.q4;

import java.util.List;

class Calculator {
    int value;  // 인스 턴스
    int[] arr;

    public Calculator() {this.value = 0;}  // 생성자

    void add(int val) {this.value += val;} // 함수 인가?

    int avg(int[] ar){
        int total = 0;
        for (int i : ar) {total += i;}
        return total/ar.length;
    }

    int avg(List<Integer> ar){
        int total = 0;
        for (int i : ar) {total += i;}
        return total/ar.size();
    }


    public int getValue() {return value;}  // 함수 인가?

}
