public class CEO extends Onaylayici {
    @Override
    public void talebiIsle(Belge belge) {
        if (belge.getOnaySeviyesi() <= 3) {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", CEO belgeyi onayladı: " + belge.getBaslik());
        } else {
            System.out.println("Seviye: " + belge.getOnaySeviyesi() +
                    ", CEO'nun da yetkisi yoktur. " + belge.getBaslik() + " daha yüksek onay gerektiriyor.");
        }
    }
}
