package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Conexao {
    public Connection conDB() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/corestore?user=root&password=root";
            con = DriverManager.getConnection(url);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + err.getMessage());
        }
        return con;
    }
}
