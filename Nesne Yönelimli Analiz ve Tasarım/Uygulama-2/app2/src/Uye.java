public class Uye {
    private String ad;
    private String soyad;
    private int uyeNo;

    public Uye(String ad, String soyad, int uyeNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.uyeNo = uyeNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    @Override
    public String toString() {
        return "\n\tÜye adı: "  + getAd() + " " + getSoyad() + "\n" +
                "\tÜye no: " + getUyeNo() + "\n";
    }
}
