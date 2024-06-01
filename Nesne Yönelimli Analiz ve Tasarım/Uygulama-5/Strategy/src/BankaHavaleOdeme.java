public class BankaHavaleOdeme implements OdemeYontemi {
    private String bankaHesapNumarasi;

    public BankaHavaleOdeme(String bankaHesapNumarasi) {
        this.bankaHesapNumarasi = bankaHesapNumarasi;
    }

    @Override
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL banka havalesi ile ödendi.");
    }
}
