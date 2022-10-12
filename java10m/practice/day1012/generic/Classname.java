package lionlike.java10m.practice.day1012.generic;

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
    <T> T geericMethod(T o){ // 제네릭 메소드 : static 을 붙히면 error 가 남
        return o;
    }

}
