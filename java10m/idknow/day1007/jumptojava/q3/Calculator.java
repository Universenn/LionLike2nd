package lionlike.java10m.idknow.day1007.jumptojava.q3;

class Calculator {
    int value;  // 인스 턴스

    public Calculator() {this.value = 0;}  // 생성자

    void add(int val) {this.value += val;} // 함수 인가?

    void isOdd(int val){
        if (this.value%2==0){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    boolean isodd(int val){
        return val%2==1; // false?
    }

    public int getValue() {return value;}  // 함수 인가?

}
