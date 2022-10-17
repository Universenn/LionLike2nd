package lionlike.java10m.practice.week1.jumptojava.q6;

public class Calculator {
    Integer value;

    public Calculator() {
        this.value = 0;
    }
    public Calculator(int value) {
        this.value = value;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}