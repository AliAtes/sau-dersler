//Adapter class, evdeki priz 220V çıkış sağlasa da,
//adaptör aracılığıyla 110V cihaz çalıştırılabilir.
public class LaptopAdapter implements Priz {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void gucVer() {
        // Priz arayüzündeki 220V, LaptopAdapter ile 19V'a düşürülerek laptop çalıştırıldı.
        laptop.calistir19V();
    }
}