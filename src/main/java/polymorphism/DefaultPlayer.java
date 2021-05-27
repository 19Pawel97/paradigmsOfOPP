package polymorphism;

public class DefaultPlayer extends VodPlayer {

    @Override
    public void play(String title) {
        System.out.println("DefaultPlayer plays " + title);
    }
}
