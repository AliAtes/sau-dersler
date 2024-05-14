// Abone (Observer) sınıfı - Haber Ekranı
class NewsScreen implements Observer {
    @Override
    public void update(String news) {
        // Uygulamanın ekran güncelleme işlemlerinin gerçekleştirildiği yer.
        System.out.println("Yeni haber geldi: " + news);
    }
}

// github.com/aliates/sau-dersler

