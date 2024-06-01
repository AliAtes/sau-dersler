public class BlokeDurumu implements HesapDurumu{
    @Override
    public void paraYatir(Hesap hesap, double miktar) {
        System.out.println("İlk durum: " + hesap.getDurum().getClass());
        System.out.println("Hesap blokeli, işlem yapılamaz.");
        System.out.println("Son durum: " + hesap.getDurum().getClass() + "\n");
    }

    @Override
    public void paraCek(Hesap hesap, double miktar) {
        System.out.println("İlk durum: " + hesap.getDurum().getClass());
        System.out.println("Hesap blokeli, işlem yapılamaz.");
        System.out.println("Son durum: " + hesap.getDurum().getClass() + "\n");
    }
}
