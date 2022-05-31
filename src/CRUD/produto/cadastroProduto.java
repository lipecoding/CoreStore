package CRUD.produto;

import java.util.Scanner;

public class cadastroProduto{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("=========================\nCadastro de produto\n========================= ");
        System.out.println();

        System.out.println("Digite o nome do produto?");
        leitor.nextLine();
        prod.setNome(leitor.nextLine());

        System.out.println("Digite a quantidade comprada");
        prod.setQuantidade(leitor.nextInt());

        System.out.println("Digite o tipo do jogo");
        leitor.nextLine();
        prod.setTipo(leitor.nextLine());

        System.out.println("Digite a faixa etaria do jogo(idade minima)");
        prod.setFaixaEtaria(leitor.nextInt());

        System.out.println("Digite a plataforma do jogo(Steam, Epic Games, etc");
        leitor.nextLine();
        prod.setPlataforma(leitor.nextLine());

        System.out.println("Digite qual o nome da empresa criadora do jogo");
        leitor.nextLine();
        prod.setEmpresaCriadora(leitor.nextLine());

        System.out.println("Digite o preco de custo do jogo");
        prod.setPrecoCusto(leitor.nextDouble());

        System.out.println("Digite o preco de venda do jogo");
        prod.setPrecoVenda(leitor.nextDouble());

    }
    
}
