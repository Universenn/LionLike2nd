package lionlike.java10m.practice.week1.jumptojava.q1;

class UpgradeCalculator extends Calculator{

    public UpgradeCalculator() {this.value = 0;} // Calculator 에서 상속받은 인스턴스 변수 int도 들고 와지는 건지

    void minus(int val) {this.value -= val;}

    public int getValue() {return value;}

}