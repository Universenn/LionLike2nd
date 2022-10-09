package lionlike.java10m.practice.day1009.Polymorphism;

class Zoo {
    void feed(Animal ani) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed " + ani.getFood());
    }
    void age(Animal ani) {  // 나이
        System.out.println("나이는 " + ani.animalAge());
    }
}


