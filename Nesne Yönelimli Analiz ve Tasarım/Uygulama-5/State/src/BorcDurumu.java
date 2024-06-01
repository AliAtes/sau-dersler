public class BorcDurumu implements HesapDurumu{
    @Override
    public void paraYatir(Hesap hesap, double miktar) {
        System.out.println("İlk durum: " + hesap.getDurum().getClass());

        hesap.bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + hesap.bakiye + " TL");
        if (hesap.bakiye >= 0) {
            hesap.setDurum(new NormalDurum());
        }

        System.out.println("Son durum: " + hesap.getDurum().getClass() + "\n");
    }

    @Override
    public void paraCek(Hesap hesap, double miktar) {
        System.out.println("İlk durum: " + hesap.getDurum().getClass());

        System.out.println("Borcunuz var, para çekemezsiniz!");

        System.out.println("Son durum: " + hesap.getDurum().getClass() + "\n");
    }
}
