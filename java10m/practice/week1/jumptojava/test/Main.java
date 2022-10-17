package lionlike.java10m.practice.week1.jumptojava.test;

public class Main {
    public static void main(String[] args) {
        Counter mycont = new Counter();
        test ex = new test();

        Updater myupdater = new Updater();
        myupdater.update(mycont);
        System.out.println(mycont.count);

    }
}
