import java.time.LocalDate;
import java.util.Date;

public class Odunc {
    private Uye uye;
    private Kitap kitap;
    private LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    // Constructor
    public Odunc(Uye uye, Kitap kitap, LocalDate alisTarihi, LocalDate iadeTarihi) {
        this.uye = uye;
        this.kitap = kitap;
        this.alisTarihi = alisTarihi;
        this.iadeTarihi = iadeTarihi;

        kitap.setOduncAlindiMi(true);
    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public LocalDate getAlisTarihi() {
        return alisTarihi;
    }

    public void setAlisTarihi(LocalDate alisTarihi) {
        this.alisTarihi = alisTarihi;
    }

    public LocalDate getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(LocalDate iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }

    @Override
    public String toString() {
        return "\n\tÖdünç alınan kitap: " + kitap.getAd() + "\n" +
                "\tÖdünç alan üye: " + uye.getAd() + " " + uye.getSoyad() + "\n" +
                "\tÖdünç alınma tarihi: " + getAlisTarihi() + "\n" +
                "\tİade tarihi: " + getIadeTarihi() + "\n";
    }
}
