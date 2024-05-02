public class Karayolu extends Kargo {

    public Karayolu(int no, String etiket, double agirlik) {
        super(no, etiket, agirlik, Arac.Karayolu);
    }

    @Override
    public double CalculateCost() {
        return super.Agirlik * 8.5;
    }
}
