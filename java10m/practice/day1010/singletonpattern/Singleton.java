package lionlike.java10m.practice.day1010.singletonpattern;

public class Singleton {
    private Singleton(){}

    public static Singleton getInstance(){
        return new Singleton(); // 같은 생성자 호출이 가능
    }
}
