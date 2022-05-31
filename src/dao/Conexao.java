package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection conDB() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/corestore?user=root&password=";
            con = DriverManager.getConnection(url);
        } catch (SQLException err) {
            System.out.println("Erro de conexão: " + err.getMessage());
        }
        return con;
    }
}
