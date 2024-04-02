import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Kütüphane oluştur.
        Kutuphane kutuphane = new Kutuphane("Saü Merkez Kütüphane");

        // Kitap ekle.
        Kitap kitap1 = new Kitap("C++, Java ve C# ile UML ve Dizayn Paternleri", "Aykut Taşdelen", 2020);
        Kitap kitap2 = new Kitap("Derin Öğrenme", "Ian Goodfellow", 2017);
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);

        // Üye ekle.
        Uye uye1 = new Uye("Ali", "ATEŞ", 1001);
        Uye uye2 = new Uye("Ahmet", "YILMAZ", 1002);
        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);

        // Ödünç ver.
        Odunc odunc1 = new Odunc(uye1, kitap1, LocalDate.now(), LocalDate.now().plusDays(7L));
        Odunc odunc2 = new Odunc(uye2, kitap2, LocalDate.now(), LocalDate.now().plusDays(7L));
        kutuphane.oduncVer(odunc1);
        kutuphane.oduncVer(odunc2);

        // Kütüphanenin son durumunu yazdır.
        System.out.println(kutuphane);
    }
}