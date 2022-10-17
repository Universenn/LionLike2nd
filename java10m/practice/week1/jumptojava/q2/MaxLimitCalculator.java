package lionlike.java10m.practice.week1.jumptojava.q2;

class MaxLimitCalculator extends Calculator{
    void add(int val) {
        this.value += val;
        if(this.value>100){
            this.value = 100;
        }
    } // 함수 인가?


}
