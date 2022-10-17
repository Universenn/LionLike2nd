package lionlike.java10m.practice.week2.day1009.Polymorphism;

class Tiger extends Animal {
    @Override
    public String getFood() {
        return this.name+" apple";
    }
    @Override
    public int animalAge(){
        return 43;
    }
    public void bark() {
        System.out.println("짖기 Tiger");
    }
}
