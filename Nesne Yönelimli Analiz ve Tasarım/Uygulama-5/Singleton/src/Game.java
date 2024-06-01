public class Game {
    private GameSettings settings;
    private Player player;

    public Game(Player player) {
        this.settings = GameSettings.getInstance();
        this.player = player;
    }

    public GameSettings getSettings() {
        return settings;
    }

    public void start() {
        System.out.println(
                "Oyun başlangıç ayarları: " +
                settings.getScreenWidth() + "x" + settings.getScreenHeight() +
                " : " + (settings.isFullscreen() ? "Tam ekran" : "Pencere") + " modu."
        );
        player.play();
    }

    public void changeSettings(int width, int height, boolean fullscreen) {
        settings.setScreenWidth(width);
        settings.setScreenHeight(height);
        settings.setFullscreen(fullscreen);
        System.out.println(
                "Yeni oyun ayarları: " +
                width + "x" + height +
                " : " + (settings.isFullscreen() ? "Tam ekran" : "Pencere") + " modu."
        );
    }
}
