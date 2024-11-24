import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class databaseHelper {

    private Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/kontak db"; // Ganti dengan nama database Anda
            String username = "root"; // Ganti dengan username MySQL Anda
            String password = ""; // Ganti dengan password MySQL Anda
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }

    public ResultSet getContacts() {
        try {
            Connection conn = getConnection();
            if (conn == null) return null;
            String query = "SELECT * FROM kontak"; // Pastikan tabel `kontak` ada di database Anda
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addContact(String nama, String noHandphone, String email, String kategori) {
        try (Connection conn = getConnection()) {
            if (conn == null) return;
            String query = "INSERT INTO kontak (nama, nomor_handphone, email, kategori) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nama);
            stmt.setString(2, noHandphone);
            stmt.setString(3, email);
            stmt.setString(4, kategori);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menambah data: " + e.getMessage());
        }
    }

    public void updateContact(int id, String nama, String noHandphone, String email, String kategori) {
        try (Connection conn = getConnection()) {
            if (conn == null) return;
            String query = "UPDATE kontak SET nama = ?, nomor_handphone = ?, email = ?, kategori = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nama);
            stmt.setString(2, noHandphone);
            stmt.setString(3, email);
            stmt.setString(4, kategori);
            stmt.setInt(5, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + e.getMessage());
        }
    }

    public void deleteContact(int id) {
        try (Connection conn = getConnection()) {
            if (conn == null) return;
            String query = "DELETE FROM kontak WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
        }
    }
}
