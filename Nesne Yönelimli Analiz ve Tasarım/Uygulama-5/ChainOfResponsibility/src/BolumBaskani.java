public class BolumBaskani extends Onaylayici {
    @Override
    public void talebiIsle(Belge belge) {
        if (belge.getOnaySeviyesi() <= 1) {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", Bölüm Yöneticisi belgeyi onayladı: " + belge.getBaslik());
        } else if (sonrakiOnaylayici != null) {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", Bölüm Yöneticisi'nin yetkisi yoktur.");
            sonrakiOnaylayici.talebiIsle(belge);
        }
    }
}
