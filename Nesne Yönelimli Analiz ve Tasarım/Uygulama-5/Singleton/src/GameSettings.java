public class GameSettings {
    // github.com/aliates/sau-dersler
    private static GameSettings instance;
    private int screenWidth;
    private int screenHeight;
    private boolean fullscreen;

    private GameSettings() {
        screenWidth = 1920;
        screenHeight = 1080;
        fullscreen = true;
    }

    public static synchronized GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }
}
