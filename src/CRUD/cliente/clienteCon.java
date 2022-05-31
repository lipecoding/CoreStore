package CRUD.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
            pstm.setInt(6, objCliente.getSenha());
            pstm.setInt(7, objCliente.getIdade());
            pstm.setString(8, objCliente.getTelefone());
            pstm.setString(9, objCliente.getCep());
            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            System.out.println("Erro de clienteCon: " + e.getMessage());
        }
    }
}
