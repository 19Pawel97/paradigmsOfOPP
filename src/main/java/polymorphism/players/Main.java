package polymorphism.players;

public class Main {
    public static void main(String[] args) {
        final String player = args[0];
        VodPlayer vodPlayer = null;
        if (player.equals("Netflix")) {
            vodPlayer = new NetflixPlayer();
        } else if (player.equals("HBOGo")) {
            vodPlayer = new HBOGoPlayer();
        } else {
            vodPlayer = new DefaultPlayer();
        }
        play(vodPlayer, "Trailer Park Boys");
    }

    private static void play(VodPlayer vodPlayer, String title) {
        vodPlayer.play(title);
    }
}
