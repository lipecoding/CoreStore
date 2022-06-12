package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;

public class usuarioCon {

    Connection con = new Conexao().conDB();
    PreparedStatement pstm;

    public void cadastroUsuario(dto.Usuario objUsuario) {

        String sql = "insert into usuario (nome,sobrenome,endereco,cpf,email,senha,idade,telefone,cep) values (?,?,?,?,?,?,?,?,?)";

        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuario.getNome());
            pstm.setString(2, objUsuario.getSobrenome());
            pstm.setString(3, objUsuario.getEndereco());
            pstm.setString(4, objUsuario.getCpf());
            pstm.setString(5, objUsuario.getEmail());
            pstm.setString(6, objUsuario.getSenha());
            pstm.setInt(7, objUsuario.getIdade());
            pstm.setString(8, objUsuario.getTelefone());
            pstm.setString(9, objUsuario.getCep());
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de usuarioCon: " + e.getMessage());
        }
    }

    public ResultSet loginUsuario(dto.Usuario objUsuario) {

        try {

            String sql = "select * from usuario where email = ? and senha = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuario.getEmail());
            pstm.setString(2, objUsuario.getSenha());

            ResultSet rSet = pstm.executeQuery();

            return rSet;

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Falha no login:" + e.getMessage());
            return null;
        }
    }
    public ResultSet adminUsuario(dto.Usuario objUsuario) {

        try {


            String adm = "select * from usuario where email = ? and senha = ? and admin = 1";
            
            pstm = con.prepareStatement(adm);
            pstm.setString(1, objUsuario.getEmail());
            pstm.setString(2, objUsuario.getSenha());

            ResultSet aSet = pstm.executeQuery();

            return aSet;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO adminUsuario: " + e.getMessage());
            return null;

        }
    }

}

