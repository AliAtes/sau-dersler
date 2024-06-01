public class PayServisOdeme implements OdemeYontemi {
    private String email;
    private String sifre;

    public PayServisOdeme(String email, String sifre) {
        this.email = email;
        this.sifre = sifre;
    }

    @Override
    public void odemeYap(double miktar) {
        System.out.println(miktar + " TL ödeme servisi ile ödendi.");
    }
}
