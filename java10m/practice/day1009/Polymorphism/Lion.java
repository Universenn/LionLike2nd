package lionlike.java10m.practice.day1009.Polymorphism;

class Lion extends Animal {
    @Override
    public String getFood() {
        return this.name+" banana";
    }
    @Override
    public int animalAge(){
        return 33;
    }
    public void bark() {
        System.out.println("짖기 Lion");
    }
}
