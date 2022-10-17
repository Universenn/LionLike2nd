package lionlike.java10m.practice.week2.day1009.interfacee;

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();
        Tiger ti = new Tiger();
        ti.name = "호랑이";
        Lion li = new Lion();
        li.name = "사자";

        zk.feed(ti);  // feed apple 출력
        zk.feed(li);  // feed banana 출력
    }
}