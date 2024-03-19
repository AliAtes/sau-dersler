
import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);

        System.out.print("\nSiparis numarası giriniz: ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        Siparis siparis = new Siparis(siparisNo);
        SiparisKalemi siparisKalemi;
        Urun urun;
        String cevap;

        do{
            urun = new Urun();

            System.out.print("Ürün adını giriniz: ");
            urun.setAd(giris.nextLine());

            System.out.print("Ürün birim fiyatını giriniz: ");
            urun.setBirimFiyati(giris.nextDouble());
            giris.nextLine();

            System.out.print("Siparis adedini giriniz: ");
            siparisKalemi = new SiparisKalemi(urun, giris.nextInt());
            siparis.sepeteEkle(siparisKalemi);
            giris.nextLine();

            System.out.println("Sepetinizdeki Ürünler:");
            System.out.println(siparis.getSiparisKalemleri());

            System.out.print("\nSepete eklemek istediğiniz başka ürün var mı (e/h)?");
            cevap = giris.nextLine();

        } while(cevap.equalsIgnoreCase("E"));

        System.out.println("\nSipariş Bilgileriniz: \n" + siparis);
    }
}