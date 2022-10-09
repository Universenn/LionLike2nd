package lionlike.java10m.practice.day1010.singletonpattern;

public class Singleton {
    private static Singleton one;
    private Singleton(){}

    public static Singleton getInstance(){
        if(one ==null){
            one = new Singleton();
        }
        return one; // 같은 생성자 호출이 가능
    }
}
