package lionlike.java10m.practice.week2.day1009.interfacee;

class ZooKeeper {
    void feed(Predator prd) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed " + prd.getFood());
    }
}

