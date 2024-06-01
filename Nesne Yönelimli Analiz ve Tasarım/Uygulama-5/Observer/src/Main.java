
public class Main {
    public static void main(String[] args) {
        // Haber yayıncısı oluşturma
        NewsPublisher newsPublisher = new NewsPublisher();

        // Haber ekranı oluşturma
        NewsScreen newsScreen = new NewsScreen();

        // Haber ekranını haber yayıncısına abone yapma
        newsPublisher.addObserver(newsScreen);

        // Yeni haber yayınlama
        newsPublisher.publishNews("Yeni teknoloji haberleri!");

        // Haber ekranını haber yayıncısından çıkarma
        newsPublisher.removeObserver(newsScreen);

        // Yeni haber yayınlama
        newsPublisher.publishNews("Spor haberleri!");
    }
}