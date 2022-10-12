package lionlike.java10m.practice.day1012.generic;

import lionlike.java10m.practice.day1010.staticpractice1.Static;

public class Classname<F>{
    private F frist; // 제네릭 타입 변수
//    private S second; // 제네릭 타입 변수

    void set(F frist){
        this.frist = frist;
    }

    F get() {
        return frist;
    }

//    public S getSecond() {
//        return second;
//    }
//
    static <T> T geericMethod1(T o){ // 제네릭 메소드 : static 을 붙히면 error 가 남
        return o;
    }
    static <E> E geericMethod2(E o){ // 제네릭 메소드 : static 을 붙히면 error 가 남
        return o;
    }

}
