import java.util.ArrayList;
import java.util.List;

// Gözlenen (Subject) sınıfı
public class NewsPublisher {
    private List<Observer> observers = new ArrayList<>();

    // Abone ekleme metodu
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Abone çıkarma metodu
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Yeni haber yayınlama metodu
    public void publishNews(String news) {
        notifyObservers(news);
    }

    // Gözlemcilere haber verme metodu
    private void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
