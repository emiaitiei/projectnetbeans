/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class koneksi {
    private final String url="jdbc:mysql://localhost/gudang";
    private final String username_xamp="root";
    private final String password_xamp="";
    private Connection con;
    public void connect() {
        try{
            con= DriverManager.getConnection(url, username_xamp, password_xamp);
            System.out.println("Koneksi Berhasil");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }

    void getcon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}