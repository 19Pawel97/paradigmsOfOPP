package polymorphism.birds;

public class Cuckoo implements Bird{
    @Override
    public void sing() {
        System.out.println("kuku");
    }

    @Override
    public void move() {
        System.out.println("flying fast");
    }
}
