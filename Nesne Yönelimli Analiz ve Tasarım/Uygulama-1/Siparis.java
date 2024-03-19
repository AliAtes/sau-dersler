import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private int siparisNo;
    private LocalDateTime siparisTarihi;
    private double genelToplam;
    private List<SiparisKalemi> siparisKalemleri = new ArrayList<SiparisKalemi>();

    public List<SiparisKalemi> getSiparisKalemleri() {
        return siparisKalemleri;
    }

    public Siparis(int siparisNo) {
        this.siparisNo = siparisNo;
        this.siparisTarihi = LocalDateTime.now();
        this.genelToplam=0;
    }

    public void sepeteEkle(SiparisKalemi siparisKalemi)
    {
        genelToplam += siparisKalemi.araToplam();
        siparisKalemleri.add(siparisKalemi);
    }

    @Override
    public String toString() {
        return "Siparis{ \n" +
                "\tSipariş No= " + siparisNo + "\n" +
                "\tSipariş Tarihi= " + siparisTarihi + "\n" +
                "\tGenel Toplam= " + genelToplam + "\n" +
                "\tSipariş Kalemleri= " + siparisKalemleri + "\n" +
                '}';
    }
}
