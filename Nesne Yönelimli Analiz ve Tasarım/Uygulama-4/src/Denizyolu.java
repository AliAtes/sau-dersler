public class Denizyolu extends Kargo{

    public Denizyolu(int no, String etiket, double agirlik) {
        super(no, etiket, agirlik, Arac.Denizyolu);
    }

    @Override
    public double CalculateCost() {
        return super.Agirlik * 9.5;
    }

}
