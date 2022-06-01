package CRUD.cliente;

import java.util.Scanner;

public class teste{
    public static void main(String[] args) {
        

        Scanner leitor = new Scanner(System.in);
        Cliente objCliente = new Cliente();
        clienteCon objClienteCon = new clienteCon();        

        System.out.println("========================\nCadastro de cliente\n========================= ");
        System.out.println();

        System.out.println("Digite seu nome");
        objCliente.setNome(leitor.next());

        System.out.println("Digite seu sobrenome");
        leitor.nextLine();
        objCliente.setSobrenome(leitor.nextLine());

        System.out.println("Digite sua idade");
        objCliente.setIdade(leitor.nextInt());

        System.out.println("Digite seu CPF");
        objCliente.setCpf(leitor.next());

        System.out.println("Digite seu endereco");
        leitor.nextLine();
        objCliente.setEndereco(leitor.nextLine());

        System.out.println("Digite seu CEP");
        objCliente.setCep(leitor.next());

        System.out.println("Digite seu e-mail");
        objCliente.setEmail(leitor.next());

        System.out.println("Digite sua senha(apenas numeros)");
        objCliente.setSenha(leitor.next());

        System.out.println("Digite seu telefone");
        objCliente.setTelefone(leitor.next());

        objClienteCon.cadastroCliente(objCliente);
    }    
}
