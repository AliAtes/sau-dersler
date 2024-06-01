//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        * Strateji Tasarım Modeli davranışsal bir tasarım modelidir.
        * Bir nesnenin davranışını, onu farklı stratejilere dahil ederek dinamik olarak değiştirmenize olanak tanır.
        * Bu model, bir nesnenin statik olarak tek bir davranış sergilemesi yerine,
        * çalışma zamanında birden fazla davranış arasından seçim yapmasına olanak tanır.
        * */

        OdemeContext odemeContext = new OdemeContext();

        // Kredi Kartı ile ödeme
        odemeContext.setOdemeYontemi(new KrediKartiOdeme("1234-5678-9012-3456", "12/23", "123"));
        odemeContext.odemeYap(250.0);

        // PayPal ile ödeme
        odemeContext.setOdemeYontemi(new PayServisOdeme("kullanici@example.com", "sifre"));
        odemeContext.odemeYap(150.0);

        // Banka Havalesi ile ödeme
        odemeContext.setOdemeYontemi(new BankaHavaleOdeme("TR12345678901234567890"));
        odemeContext.odemeYap(300.0);

    }
}