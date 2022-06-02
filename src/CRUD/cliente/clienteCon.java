package CRUD.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Conexao;

public class clienteCon {

    Connection con;
    PreparedStatement pstm;

    public void cadastroCliente(Cliente objCliente) {

        con = new Conexao().conDB();

        String sql = "insert into cliente (nome,sobrenome,endereco,cpf,email,senha,idade,telefone,cep) values (?,?,?,?,?,?,?,?,?)";

        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objCliente.getNome());
            pstm.setString(2, objCliente.getSobrenome());
            pstm.setString(3, objCliente.getEndereco());
            pstm.setString(4, objCliente.getCpf());
            pstm.setString(5, objCliente.getEmail());
            pstm.setString(6, objCliente.getSenha());
            pstm.setInt(7, objCliente.getIdade());
            pstm.setString(8, objCliente.getTelefone());
            pstm.setString(9, objCliente.getCep());
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            System.out.println("Erro de clienteCon: " + e.getMessage());
        }
    }

    public ResultSet loginCliente(Cliente objCliente) {
        con = new Conexao().conDB();

        try {

            String sql = "select * from cliente where email = ? and senha = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objCliente.getEmail());
            pstm.setString(2, objCliente.getSenha());

            ResultSet rSet = pstm.executeQuery();

            return rSet;

        } catch (SQLException e) {
            
            System.out.println("Falha no login:" + e.getMessage());
            return null;
        }
    }
    public ResultSet adminCliente(Cliente objCliente) {
        con = new Conexao().conDB();

        try {

            String adm = "select * from cliente where email = ? and senha = ? and admin = 1";
            
            pstm = con.prepareStatement(adm);
            pstm.setString(1, objCliente.getEmail());
            pstm.setString(2, objCliente.getSenha());

            ResultSet aSet = pstm.executeQuery();

            return aSet;

        } catch (Exception e) {

            System.out.println("ERRO adminCliente: " + e.getMessage());
            return null;

        }
    }

}

