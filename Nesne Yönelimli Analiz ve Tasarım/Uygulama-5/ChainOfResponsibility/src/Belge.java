public class Belge {
    private String baslik;
    private String icerik;
    private int onaySeviyesi;

    public Belge(String baslik, String icerik, int onaySeviyesi) {
        this.baslik = baslik;
        this.icerik = icerik;
        this.onaySeviyesi = onaySeviyesi;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public int getOnaySeviyesi() {
        return onaySeviyesi;
    }
}
