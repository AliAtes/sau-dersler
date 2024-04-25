
import java.util.List;
import java.util.Scanner;

public class Uygulama {

    private static IUrunRepository urunRepository = new UrunRepositoryImplPostgreSQL();
    private static UrunService urunService = new UrunService(urunRepository);

    public static void main(String args[]){

        ///********************** Ürün Arama **************************"

        int urunNo = 1255;
        Urun urun = urunService.ara(urunNo);
        if(urun!=null)
            System.out.println("Aradığınız ürün:"+urun);
        else
            System.out.println("aradığınız ürün bulunamadı");

        ///********************** Tüm Ürünleri Getir **************************

        List<Urun> urunlerinListesi = urunService.tumUrunler();
        System.out.println(urunlerinListesi);

        ///********************** Ürün Ekle **************************

        String urununAdi="";

        // Liste içerisinden ürün adına göre arama yap ve urun nesnesini döndürüyor

        Urun arananUrun = urunlerinListesi.stream()
                .filter(mevcutUrun -> urununAdi.equalsIgnoreCase(mevcutUrun.getAdi()))
                .findAny()
                .orElse(null);

        // ********************** Ürünü Kaydet ************************

        if(arananUrun!=null){
            // Ürün yoksa yeni ürünü kaydet.
            Urun yeniUrun = new Urun("Ürün Adı", 1000, 10);
            urunService.kaydet(urun);
        }

        // ********************** Ürünü Güncelle ************************
        int urunNo1 = 1125;
        Urun eskiUrun = urunService.ara(urunNo1);
        eskiUrun.setBirimFiyati(5000);
        urunService.guncelle(eskiUrun);

        // ********************** Ürünü Sil ************************

        List<Urun> urunlerinListesi1 = urunService.tumUrunler();
        int silinecekUrunNo = 1550;
        urunService.sil(silinecekUrunNo);

    }
}




























