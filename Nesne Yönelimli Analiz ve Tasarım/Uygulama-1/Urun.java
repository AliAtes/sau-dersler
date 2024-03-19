
public class Urun {
    private String ad;
    private double birimFiyati;
    private int stokMiktari;

    public Urun() {

    }

    public String getAd() {
        return ad;
    }



    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokMiktari() { return stokMiktari; }

    public void setStokMiktari(int stokMiktari) { this.stokMiktari = stokMiktari; }

    @Override
    public String toString() {
        return "Urun{" +
                "ad='" + ad + '\'' +
                '}';
    }
}
