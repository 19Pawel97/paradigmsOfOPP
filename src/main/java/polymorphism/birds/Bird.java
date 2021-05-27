package polymorphism.birds;

public interface Bird {
    default void move() {
        System.out.println("flying");
    }

    void sing();
}
