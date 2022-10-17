package lionlike.java10m.practice.week2.day1012.generic;

public class Main {
    public static void main(String[] args) {
        // 제네릭에 활요은 객체를 생성할때 타입을 지정하는 것?
//        Classname<String> s = new Classname<>(); // 객체를 생성할때 타입을 정해줌
//        Classname<Integer> i = new Classname<>(); // 객체를 생성할때 타입을 정해줌

//        s.set("10");
//        i.set(10);

//        System.out.println("s data : "+s.get());
//        System.out.println("s E Type : "+s.get().getClass().getName());  // 반환된 변수의 타입을 출련
//
//        System.out.println();
//
//        System.out.println("i data : "+i.get());
//        System.out.println("i E Type : "+i.get().getClass().getName()); // 반환된 변수의 타입을 출련




//        Classname<String, Integer> si = new Classname(); // 객체를 생성할때 타입을 정해줌
//        si.set("뭘 봐",13);
//        System.out.println(si.getFrist()+" "+si.getSecond());


        Classname<String> s = new Classname<>();

        // 제네릭 메소드는 피라미터 타입에 따라 T타입이 결정 된다.
        System.out.println(s.geericMethod1(10));
        System.out.println(s.geericMethod1("abcd"));
        System.out.println(s.geericMethod1('1'));


        System.out.println("<E> returnType : "+Classname.geericMethod1(3).getClass().getName());
        System.out.println("<E> returnType : "+Classname.geericMethod1("Asds").getClass().getName());
        System.out.println("<T> returnType : "+Classname.geericMethod1(s).getClass().getName());
        System.out.println("<T> returnType : "+Classname.geericMethod1(3.0).getClass().getName());


    }
}
