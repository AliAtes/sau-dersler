import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private String k_adi;
    private List<Kitap> kitaplar;
    private List<Uye> uyeler;
    private List<Odunc> oduncler;

    // Constructor
    public Kutuphane(String k_adi) {
        this.k_adi = k_adi;
        this.kitaplar = new ArrayList<>();
        this.uyeler = new ArrayList<>();
        this.oduncler = new ArrayList<>();
    }

    public String getK_adi(){
        return k_adi;
    }

    // Kitap Ekleme ve Silme Metodları
    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);
    }

    // Üye Ekleme ve Silme Metodları
    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void uyeSil(Uye uye) {
        uyeler.remove(uye);
    }

    // Ödünç verme ve iade alma metodları
    public void oduncVer(Odunc odunc) { oduncler.add(odunc); }

    public void oduncIadeAl(Odunc odunc) { oduncler.remove(odunc); }

    // Kitapların listesini alma
    public List<Kitap> getKitaplar() {
        return kitaplar;
    }

    // Üyelerin listesini alma
    public List<Uye> getUyeler() {
        return uyeler;
    }

    // Ödünç listesi alma
    public List<Odunc> getOduncler() {
        return oduncler;
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + getK_adi() + "\n--------------------" +
                "\nKitaplar: " + getKitaplar() + "\n" +
                "\nÜyeler: " + getUyeler() + "\n" +
                "\nÖdünçler: " + getOduncler();
    }
}
