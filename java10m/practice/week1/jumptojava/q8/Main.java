package lionlike.java10m.practice.week1.jumptojava.q8;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번
        Animal b = new Dog();  // 2번
        Animal c = new Lion();  // 3번
//        Dog d = new Animal();  // 4번 // 자식은 부모겍체를 생성할수 없다.
        Predator e = new Lion();  // 5번
    }
}