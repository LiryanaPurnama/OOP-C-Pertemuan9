package pertemuan901;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Liryana Purnama
 * TGL 17 Mei 2025
 * encapsulation
 */
public class Pertemuan901 {
    
    public static void main(String[] args) throws SQLException {
        
        dbkoneksi dbk= new dbkoneksi();
        
        Statement st = dbk.koneksi().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            
            System.out.println("Nama : "+rs.getString("NAMA"));
            System.out.println("NIM : "+rs.getString("NIM"));
            System.out.println("Jurusan : "+rs.getString("JURUSAN"));
            System.out.println("Alamat : "+rs.getString("ALAMAT"));
            System.out.println("");
            
        }
    }
    
}
