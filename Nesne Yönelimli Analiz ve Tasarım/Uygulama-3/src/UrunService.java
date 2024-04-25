
import java.util.List;

public class UrunService {

    IUrunRepository urunRepository;

    public UrunService(IUrunRepository urunRepository) {
        this.urunRepository = urunRepository;
    }

    public Urun ara(int urunNumarasi) {
        return urunRepository.ara(urunNumarasi);
    }

    public List<Urun> tumUrunler() {
        return urunRepository.tumUrunler();
    }

    public void kaydet(Urun urun) {
        urunRepository.kaydet(urun);
    }

    public void guncelle(Urun urun) {
        urunRepository.guncelle(urun);
    }

    public void sil(int urunNumarasi) {
        urunRepository.sil(urunNumarasi);
    }
}
