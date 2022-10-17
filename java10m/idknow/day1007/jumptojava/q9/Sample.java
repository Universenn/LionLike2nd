package lionlike.java10m.idknow.day1007.jumptojava.q9;

interface Predator {
    String bark();
}

abstract class Animal {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    public String bark() {
        return "Bark bark!!";
    }
    public String hello() {
        return "hello Lion";
    }
}

public class Sample {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

//        Animal a = new Lion();
//        Animal a1 = new Animal();
//       두개의 차이점?
//       추상클래스는 객체를 생성할수 없다?
//       인터페이스와 추상클래스는 단독으로 객체 생성할수 없다?


        System.out.println(a.hello());  // 1번
//        System.out.println(a.bark());   // 2번
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
//        System.out.println(c.hello());  // 5번
        System.out.println(c.bark());   // 6번
    }
}
