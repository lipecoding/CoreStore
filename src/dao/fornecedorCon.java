package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;

public class fornecedorCon {
    Connection con = new Conexao().conDB();
    PreparedStatement pstm;

    public void cadastroFornecedor(dto.Fornecedor objFornecedor) {
        try {
            String set = "insert into fornecedor (CNPJ, razaoSocial, nomeFantasia, endereco, telefone, codigoBanco, agencia, digitoAgencia, numeroConta, digitoConta, cep) values (?,?,?,?,?,?,?,?,?,?,?)";

            pstm = con.prepareStatement(set);

            pstm.setString(1, objFornecedor.getCnpj());
            pstm.setString(2, objFornecedor.getRazaoSocial());
            pstm.setString(3, objFornecedor.getNomeFantasia());
            pstm.setString(4, objFornecedor.getEndereco());
            pstm.setString(5, objFornecedor.getTelefone());
            pstm.setInt(6, objFornecedor.getCodigoBanco());
            pstm.setInt(7, objFornecedor.getAgencia());
            pstm.setInt(8, objFornecedor.getDigitoAgencia());
            pstm.setInt(9, objFornecedor.getNumeroConta());
            pstm.setInt(10, objFornecedor.getDigitoConta());
            pstm.setString(11, objFornecedor.getCep());

            pstm.execute();
            pstm.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Cadastrofornecedor: " + err.getMessage());
        }
    }

}
