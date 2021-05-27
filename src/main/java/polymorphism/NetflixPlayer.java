package polymorphism;

public class NetflixPlayer extends VodPlayer {

    @Override
    public void play(String title) {
        System.out.println("Netflix plays " + title);
    }
}
