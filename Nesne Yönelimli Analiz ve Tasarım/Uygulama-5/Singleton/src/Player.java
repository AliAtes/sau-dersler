public class Player {
    private String name;
    private int score;
    private GameSettings settings;

    public Player(String name) {
        this.settings = GameSettings.getInstance();
        this.name = name;
        this.score = 0;
    }

    public GameSettings getSettings() {
        return settings;
    }

    public void play() {
        System.out.println(
                name + " oyuna başladı, çözünürlük: " +
                settings.getScreenWidth() + "x" + settings.getScreenHeight() +
                " : " + (settings.isFullscreen() ? "Tam ekran" : "Pencere") + " modu."
        );
    }

    public void addScore(int points) {
        this.score += points;
        System.out.println(name + " skor: " + score);
    }
}
