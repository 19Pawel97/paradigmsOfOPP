package polymorphism.birds;

public class Owl implements Bird{
    @Override
    public void sing() {
        System.out.println("huhu");
    }

    @Override
    public void move() {
        System.out.println("flying slow");
    }
}
