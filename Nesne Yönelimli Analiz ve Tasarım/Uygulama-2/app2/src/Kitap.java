public class Kitap {
    private String ad;
    private String yazar;
    private int yayinYili;
    private boolean oduncAlindiMi;

    // Constructor
    public Kitap(String ad, String yazar, int yayinYili) {
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.oduncAlindiMi = false;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public boolean isOduncAlindiMi() {
        return oduncAlindiMi;
    }

    public void setOduncAlindiMi(boolean oduncAlindiMi) {
        this.oduncAlindiMi = oduncAlindiMi;
    }

    @Override
    public String toString() {
        return "\n\tKitap adı: "  + getAd() + "\n" +
                "\tYazar: " + getYazar() + "\n" +
                "\tYayın yılı: " + getYayinYili() + "\n" +
                "\tÖdünç alındı mı: " + isOduncAlindiMi() + "\n";
    }
}
