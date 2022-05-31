package CRUD.cliente;

import java.util.Scanner;

public class teste{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("========================\nCadastro de cliente\n========================= ");
        System.out.println();

        System.out.println("Digite seu nome");
        cliente.setNome(leitor.next());

        System.out.println("Digite seu sobrenome");
        leitor.nextLine();
        cliente.setSobrenome(leitor.nextLine());

        System.out.println("Digite sua idade");
        cliente.setIdade(leitor.nextInt());

        System.out.println("Digite seu CPF");
        cliente.setCpf(leitor.next());

        System.out.println("Digite seu endereco");
        leitor.nextLine();
        cliente.setEndereco(leitor.nextLine());

        System.out.println("Digite seu CEP");
        cliente.setCep(leitor.next());

        System.out.println("Digite seu e-mail");
        cliente.setEmail(leitor.next());

        System.out.println("Digite sua senha(apenas numeros)");
        cliente.setSenha(leitor.nextInt());

        System.out.println("Digite seu telefone");
        cliente.setTelefone(leitor.next());

        Cliente objCliente = new Cliente();
        clienteCon objClienteCon = new clienteCon();
        objClienteCon.cadastroCliente(objCliente);
    }    
}
