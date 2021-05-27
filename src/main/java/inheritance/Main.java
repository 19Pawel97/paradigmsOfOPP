package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Eagle(1,"Accipitridae", "Eagee");
        Animal animal2 = new Bird(2,"other");
        Animal animal3 = new Animal(3);

        animal1.move();
        Eagle eagle = (Eagle) animal1;
        eagle.hunt(10);
        eagle.hunt(5);
        System.out.println(eagle.getHuntedMice());

        animal2.move();
        Bird bird = (Bird) animal2;
        bird.sing();

    }
}
