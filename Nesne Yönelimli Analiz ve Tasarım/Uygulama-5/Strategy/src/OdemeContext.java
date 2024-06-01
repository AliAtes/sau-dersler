public class OdemeContext {
    private OdemeYontemi odemeYontemi;

    public void setOdemeYontemi(OdemeYontemi odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(double miktar) {
        odemeYontemi.odemeYap(miktar);
    }
}
