package Main;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {

    Connection conn;
    Statement st;
    ResultSet rs;

    public void setkoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            st = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Error> Koneksikan Xampp Terlebih Dahulu : " + e, "Koneksi Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }
}
