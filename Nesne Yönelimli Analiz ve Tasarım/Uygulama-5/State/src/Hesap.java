public class Hesap {
    private HesapDurumu durum;
    protected boolean hataliGiris;
    protected double bakiye;

    public Hesap() {
        this.durum = new NormalDurum();
        hataliGiris = false;
        this.bakiye = 0.0;
    }

    public void girisYap(boolean sifre){
        if(sifre == true) {
            hataliGiris = false;
        } else {
            hataliGiris = true;
            this.durum = new BlokeDurumu();
            System.out.println("Hatalı giriş yapıldı!");
        }
    }

    public void setDurum(HesapDurumu durum) {
        this.durum = durum;
    }

    public HesapDurumu getDurum() {
        return durum;
    }

    public void paraYatir(double miktar) {
        durum.paraYatir(this, miktar);
    }

    public void paraCek(double miktar) {
        durum.paraCek(this, miktar);
    }
}
