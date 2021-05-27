package inheritance;

public class Bird extends Animal {
    private String family;

    public Bird(int age, String family) {
        super(age);
        this.family = family;
    }

    public void sing() {
        System.out.println("singing");
    }
}
