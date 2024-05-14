import java.util.HashMap;
import java.util.Map;

public abstract class Onaylayici {
    protected Onaylayici sonrakiOnaylayici;

    public void setSonrakiOnaylayici(Onaylayici sonrakiOnaylayici) {
        this.sonrakiOnaylayici = sonrakiOnaylayici;
    }

    public abstract void talebiIsle(Belge belge);
}
