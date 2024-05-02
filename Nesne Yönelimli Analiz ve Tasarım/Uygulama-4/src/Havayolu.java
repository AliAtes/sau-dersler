public class Havayolu extends Kargo{

    public Havayolu(int no, String etiket, double agirlik) {
        super(no, etiket, agirlik, Arac.Havayolu);
    }

    @Override
    public double CalculateCost() {
        return super.Agirlik * 12.5;
    }

}
