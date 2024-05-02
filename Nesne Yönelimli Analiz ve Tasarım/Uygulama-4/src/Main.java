import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Kargo> kargolar = new ArrayList<Kargo>();

        Karayolu karayoluKargo = new Karayolu(1, "Kargo #1", 2.50);
        Denizyolu denizyoluKargo = new Denizyolu(2, "Kargo #2", 22.50);
        Havayolu havayoluKargo = new Havayolu(3, "Kargo #3", 12.50);

        kargolar.add(karayoluKargo);
        kargolar.add(denizyoluKargo);
        kargolar.add(havayoluKargo);

        for(Kargo kargo : kargolar){
            System.out.println(kargo);
        }


    }
}