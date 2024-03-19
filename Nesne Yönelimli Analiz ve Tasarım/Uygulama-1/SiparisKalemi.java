
public class SiparisKalemi {
    private Urun urun;
    private int adet;
    private double siparisBirimFiyati;

    public SiparisKalemi(Urun urun, int miktar) {
        this.urun = urun;
        this.adet = miktar;
        this.siparisBirimFiyati = urun.getBirimFiyati();
    }

    public double araToplam(){
        return adet * siparisBirimFiyati;
    }

    @Override
    public String toString() {
        return "SiparisKalemi{" +
                "urun=" + urun.getAd() +
                ", adet=" + adet +
                ", siparisBirimFiyati=" + siparisBirimFiyati +
                ", ara toplam=" + this.araToplam() +
                "}";
    }
}
