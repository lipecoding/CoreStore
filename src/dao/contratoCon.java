package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dto.Contrato;

public class contratoCon {
    Connection con = new Conexao().conDB();
    PreparedStatement pstm;

    public void cadastroContrato(Contrato objContrato) {
        try {
            String sql = "insert into contrato (contrato) values (?)";

            pstm = con.prepareStatement(sql);
            pstm.setString(1, objContrato.getTextoContrato());
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "contratoCon: " + e.getMessage());
        }
    }
}
