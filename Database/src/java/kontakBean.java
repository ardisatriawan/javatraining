import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthf
 */

@ManagedBean(name="kontak")
@SessionScoped
public class kontakBean implements Serializable {
    public int id;
    public String nama;
    public String alamat;
    public String telepon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public List<kontak> getKontak() throws ClassNotFoundException, SQLException {
        Connection connect = null;
 
        String url = "jdbc:mysql://localhost:3306/bukutelepon";
 
        String username = "root";
        String password = "";
 
        try {
 
            Class.forName("com.mysql.jdbc.Driver");
 
            connect = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established"+connect);
 
        } catch (SQLException ex) {
            System.out.println("in exec");
            System.out.println(ex.getMessage());
        }
        
        List<kontak> kontak = new ArrayList<>();
        PreparedStatement pstmt = connect
                .prepareStatement("SELECT Id, Nama, Alamat, Telepon FROM Kontak");
        
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            kontak kontakbaru = new kontak();
            kontakbaru.setId(rs.getInt("Id"));
            kontakbaru.setNama(rs.getString("Nama"));
            kontakbaru.setAlamat(rs.getString("Alamat"));
            kontakbaru.setTelepon(rs.getString("Telepon"));
            
            kontak.add(kontakbaru);
        }
        
        rs.close();
        pstmt.close();
        connect.close();
        
        return kontak;
    }
    
    public List<kontak> tambah(kontak kontakbaru) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection connect = null;
 
        String url = "jdbc:mysql://localhost:3306/bukutelepon";
 
        String username = "root";
        String password = "";
 
        try {
 
            Class.forName("com.mysql.jdbc.Driver");
 
            connect = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established"+connect);
 
        } catch (SQLException ex) {
            System.out.println("in exec");
            System.out.println(ex.getMessage());
        }
        
        String sql = "INSERT INTO kontak(id, nama, alamat, telepon) VALUES(?,?,?,?)";
        ps = connect.prepareStatement(sql);
        ps.setInt(1, kontakbaru.id);
        ps.setString(2, kontakbaru.nama);
        ps.setString(3, kontakbaru.alamat);
        ps.setString(4, kontakbaru.telepon);
        
        ps.close();
        connect.close();
        
        return (List<kontak>) kontakbaru;
    }
}