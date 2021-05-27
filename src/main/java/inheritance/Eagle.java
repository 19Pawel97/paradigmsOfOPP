package inheritance;

public class Eagle extends Bird {
    private String name;
    private int HuntedMice = 0;

    public Eagle(int age, String family, String name) {
        super(age, family);
        this.name = name;
    }

    public void hunt(int numberOfHuntedMice){
        this.HuntedMice += numberOfHuntedMice;
    }

    public String getName() {
        return name;
    }

    public int getHuntedMice() {
        return HuntedMice;
    }
}
