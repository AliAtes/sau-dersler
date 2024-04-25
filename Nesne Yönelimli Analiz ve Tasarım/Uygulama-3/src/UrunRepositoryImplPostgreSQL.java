
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UrunRepositoryImplPostgreSQL implements IUrunRepository {
    // SQL CRUD operations
    // github.com/aliates/sau-dersler
    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project",
                    "User", "Pass");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public Urun ara(int urunNumarasi){

        Urun urun=null;

        String sql= "SELECT *  FROM Urun WHERE urunNo=" + urunNumarasi;

        Connection conn=this.baglan();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            int urunNo;
            String adi;
            int birimFiyati;
            int stokMiktari;

            while(rs.next())
            {
                urunNo  = rs.getInt("urunNo");
                adi = rs.getString("adi");
                birimFiyati  = rs.getInt("birimFiyati");
                stokMiktari  = rs.getInt("stokMiktari");

                urun=new Urun(urunNo, adi, birimFiyati, stokMiktari);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return urun;
    }

    @Override
    public List<Urun> tumUrunler(){

        Connection conn=this.baglan();
        String sql= "SELECT *  FROM Urun";

        List<Urun> urunler = new ArrayList<Urun>();

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            conn.close();

            int urunNo;
            String adi;
            int birimFiyati;
            int stokMiktari;

            while(rs.next())
            {
                urunNo  = rs.getInt("urunNo");
                adi = rs.getString("adi");
                birimFiyati  = rs.getInt("birimFiyati");
                stokMiktari  = rs.getInt("stokMiktari");

                urunler.add(new Urun(urunNo, adi, birimFiyati, stokMiktari));
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return urunler;
    }

    @Override
    public void kaydet(Urun urun){

        Connection conn=this.baglan();
        String sql = "INSERT INTO Urun (adi, birimFiyati, stokMiktari) VALUES (?, ?, ?)";

        try
        {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, urun.getAdi());
            statement.setString(2, Objects.toString(urun.getBirimFiyati()));
            statement.setString(3, Objects.toString(urun.getStokMiktari()));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Ürün eklendi.");
            }

            conn.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void guncelle(Urun urun){
        Connection conn=this.baglan();
        String sql = "UPDATE Urun Set adi=?, birimFiyati=?, stokMiktari=?";

        try {

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, urun.getAdi());
            statement.setString(2, Objects.toString(urun.getBirimFiyati()));
            statement.setString(3, Objects.toString(urun.getStokMiktari()));

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Ürün güncellendi.");
            }

            conn.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void sil(int urunNumarasi){

        Connection conn=this.baglan();
        String sql= "DELETE FROM Urun WHERE urunNo=?";

        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Objects.toString(urunNumarasi));

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Ürün silindi.");
            }

            conn.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
