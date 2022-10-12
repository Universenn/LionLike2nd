package lionlike.java10m.practice.day1012.generic;

public class Classname<F, S>{
    private F frist; // 제네릭 타입 변수
    private S second; // 제네릭 타입 변수

    void set(F frist, S second){
        this.frist = frist;
        this.second = second;
    }

    public F getFrist() {
        return frist;
    }

    public S getSecond() {
        return second;
    }

}
