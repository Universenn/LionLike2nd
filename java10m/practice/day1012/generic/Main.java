package lionlike.java10m.practice.day1012.generic;

public class Main {
    public static void main(String[] args) {
        // 제네릭에 활요은 객체를 생성할때 타입을 지정하는 것?
//        Classname<String> s = new Classname(); // 객체를 생성할때 타입을 정해줌
//        Classname<Integer> i = new Classname(); // 객체를 생성할때 타입을 정해줌

//        s.set("10");
//        i.set(10);

//        System.out.println("s data : "+s.get());
//        System.out.println("s E Type : "+s.get().getClass().getName());  // 반환된 변수의 타입을 출련
//
//        System.out.println();
//
//        System.out.println("i data : "+i.get());
//        System.out.println("i E Type : "+i.get().getClass().getName()); // 반환된 변수의 타입을 출련




        Classname<String, Integer> si = new Classname(); // 객체를 생성할때 타입을 정해줌
        si.set("뭘 봐",13);
        System.out.println(si.getFrist()+" "+si.getSecond());


    }
}
