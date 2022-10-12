package lionlike.java10m.practice.day1012.generic;

public class Classname<E>{
    private E element; // 제네릭 타입 변수

    void set(E element){
        this.element = element;
    }

    E get(){
        return element;
    }


}
