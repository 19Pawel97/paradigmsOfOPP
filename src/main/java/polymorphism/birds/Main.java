package polymorphism.birds;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Owl();
        Bird bird2 = new Cuckoo();
        Bird bird3 = new Pigeon();

        bird1.move();
        bird1.sing();
        bird2.move();
        bird2.sing();
        bird3.move();
        bird3.sing();
    }
}
