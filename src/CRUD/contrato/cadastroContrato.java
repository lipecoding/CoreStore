package CRUD.contrato;

import java.util.Scanner;

public class cadastroContrato{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Contrato cont = new Contrato();

        System.out.println("=========================\nCadastro de Contrato\n========================= ");
        System.out.println();

        System.out.println("Digite o texto do seu contrato/termo de uso atualizado");
        leitor.nextLine();
        cont.setTextoContrato(leitor.nextLine());

    }
    
}
