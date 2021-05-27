package polymorphism.players;

public class HBOGoPlayer extends VodPlayer{
    @Override
    public void play(String title) {
        System.out.println("HBOGo plays " + title);
    }
}
