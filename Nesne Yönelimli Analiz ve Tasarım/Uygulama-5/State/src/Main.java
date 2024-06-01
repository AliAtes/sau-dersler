
public class Main {

    /*
     * State Tasarım Modeli davranışsal bir tasarım modelidir.
     * Bir nesnenin iç durumu değiştiğinde davranışının da değişmesine sağlar.
     * Nesnenin kendisi, mevcut durumuna bağlı olarak bu durum nesneleri arasında dinamik olarak geçiş yapar.
     * */

    public static void main(String[] args) {
        Hesap hesap = new Hesap();

        hesap.girisYap(true);
        hesap.paraYatir(100);
        hesap.paraCek(50);
        hesap.paraCek(150);
        hesap.paraYatir(200);

        hesap.girisYap(false);
        hesap.paraCek(150);
    }
}