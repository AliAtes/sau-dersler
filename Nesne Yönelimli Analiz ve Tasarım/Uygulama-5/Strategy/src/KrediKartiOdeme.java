public class KrediKartiOdeme implements OdemeYontemi {
    private String kartNumarasi;
    private String sonKullanmaTarihi;
    private String cvv;

    public KrediKartiOdeme(String kartNumarasi, String sonKullanmaTarihi, String cvv) {
        this.kartNumarasi = kartNumarasi;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
        this.cvv = cvv;
    }

    @Override
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL kredi kartı ile ödendi.");
    }
}

