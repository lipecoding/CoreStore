package CRUD.cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class testelogin {
    public static void main(String[] args) {

        try {

            Cliente objCliente = new Cliente();
    
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite seu email");
            objCliente.setEmail(leitor.next());

            System.out.println("Digite sua senha");
            objCliente.setSenha(leitor.next());

            clienteCon objClienteCon = new clienteCon();

            ResultSet rSet = objClienteCon.loginCliente(objCliente);
            ResultSet aSet = objClienteCon.adminCliente(objCliente);

            if(rSet.next()) {
                System.out.println("Logado com sucesso - User");
                if (aSet.next()) {
                    System.out.println("Logado com sucesso - Admin");
                }
            } else {
                System.out.println("Email/Senha incorretos!");
            }
        } catch (SQLException e) {
            System.out.println("TesteLogin: " + e.getMessage());
        }

    }
}
