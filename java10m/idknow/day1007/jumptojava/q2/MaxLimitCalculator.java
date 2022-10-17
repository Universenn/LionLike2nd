package lionlike.java10m.idknow.day1007.jumptojava.q2;

class MaxLimitCalculator extends Calculator{
    void add(int val) {
        this.value += val;
        if(this.value>100){
            this.value = 100;
        }
    } // 함수 인가?


}
