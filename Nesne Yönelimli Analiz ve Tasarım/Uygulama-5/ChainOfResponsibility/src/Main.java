public class Main {
    public static void main(String[] args) {
        // Onaylayıcı nesnelerini oluştur
        Onaylayici bolumYonetici = new BolumBaskani();
        Onaylayici genelMudurYardimcisi = new GenelMudur();
        Onaylayici ceo = new CEO();

        // Zinciri oluştur
        bolumYonetici.setSonrakiOnaylayici(genelMudurYardimcisi);
        genelMudurYardimcisi.setSonrakiOnaylayici(ceo);

        // Belgeleri oluştur
        Belge belge1 = new Belge("Bütçe Planı", "Gelecek çeyrek bütçe planı", 1);
        Belge belge2 = new Belge("Proje Teklifi", "Yeni proje teklifi detayları", 2);
        Belge belge3 = new Belge("Şirket Birleşmesi", "Şirket birleşme detayları", 3);
        Belge belge4 = new Belge("Stratejik Plan", "Uzun vadeli stratejik planlama belgesi", 4);

        bolumYonetici.talebiIsle(belge1);

        bolumYonetici.talebiIsle(belge2);

        bolumYonetici.talebiIsle(belge3);

        bolumYonetici.talebiIsle(belge4);
    }
}
