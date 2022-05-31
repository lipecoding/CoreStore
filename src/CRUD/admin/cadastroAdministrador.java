package CRUD.admin;

import java.util.Scanner;

public class cadastroAdministrador{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Administrador admin = new Administrador();

        System.out.println("=========================\nCadastro de administrador\n========================= ");
        System.out.println();

        System.out.println("Digite seu nome");
        admin.setNome(leitor.next());

        System.out.println("Digite seu sobrenome");
        admin.setSobrenome(leitor.next());

        System.out.println("Digite seu cargo");
        admin.setCargo(leitor.next());

        System.out.println("Digite sua idade");
        admin.setIdade(leitor.nextInt());

        System.out.println("Digite seu CPF");
        admin.setCpf(leitor.next());

        System.out.println("Digite seu endereco");
        admin.setEndereco(leitor.nextLine());

        System.out.println("Digite seu e-mail");
        admin.setEmail(leitor.nextLine());

        System.out.println("Digite sua senha(apenas numeros)");
        admin.setSenha(leitor.nextInt());

        System.out.println("Digite seu telefone");
        admin.setTelefone(leitor.nextBigInteger());
 
    }
    
}
