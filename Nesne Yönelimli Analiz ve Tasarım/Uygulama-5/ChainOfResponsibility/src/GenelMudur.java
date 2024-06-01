public class GenelMudur extends Onaylayici {
    @Override
    public void talebiIsle(Belge belge) {
        if (belge.getOnaySeviyesi() <= 2) {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", Genel Müdür Yardımcısı belgeyi onayladı: " + belge.getBaslik());
        } else if (sonrakiOnaylayici != null) {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", Genel Müdür'ün yetkisi yoktur.");
            sonrakiOnaylayici.talebiIsle(belge);
        }
    }
}
