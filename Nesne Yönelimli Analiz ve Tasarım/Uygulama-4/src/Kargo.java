public abstract class Kargo {

    public int No;
    public String Etiket;
    public double Agirlik;
    public abstract double CalculateCost();
    public Arac arac;

    public Kargo(int no, String etiket, double agirlik, Arac arac) {
        this.No = no;
        this.Etiket = etiket;
        this.Agirlik = agirlik;
        this.arac = arac;
    }

    @Override
    public String toString() {
        return "Kargo no: " + No + " | " +
                "Yol: " + arac + " | " +
                "Etiket: " + Etiket + " | " +
                "Agırlık: " + Agirlik + " | " +
                "Fiyat: " + CalculateCost() + " | " ;
    }

}
