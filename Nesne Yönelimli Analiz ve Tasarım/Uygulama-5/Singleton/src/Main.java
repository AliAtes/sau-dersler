public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Oyuncu1");

        Game game1 = new Game(player1);
        game1.start();

        player1.addScore(10);

        // Oyun ayarlarını değiştir
        game1.changeSettings(1280, 720, false);

        // Yeni ayarlarla başka bir oyuncu ve oyun başlat
        Player player2 = new Player("Oyuncu2");
        Game game2 = new Game(player2);

        game2.start();
        player2.addScore(20);

        // Aynı GameSettings örneği kullanılıyor mu kontrol edelim
        System.out.println(game1.getSettings() + "\n" + game2.getSettings());
        System.out.println(player1.getSettings() + "\n" + player2.getSettings());
    }
}
