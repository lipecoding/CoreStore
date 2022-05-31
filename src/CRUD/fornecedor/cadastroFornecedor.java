package CRUD.fornecedor;

import java.util.Scanner;

public class cadastroFornecedor{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Fornecedor forn = new Fornecedor();
    
        System.out.println("=========================\nCadastro de fornecedor\n========================= ");
        System.out.println();
    
        System.out.println("Digite a razao social do fornecedor");
        leitor.nextLine();
        forn.setRazaoSocial(leitor.nextLine());

        System.out.println("Digite o nome fantasia(Nao obrigatorio)");
        leitor.nextLine();
        forn.setNomeFantasia(leitor.nextLine());

        System.out.println("Digite seu CNPJ");
        forn.setCnpj(leitor.next());

        System.out.println("Digite seu endereco");
        leitor.nextLine();
        forn.setEndereco(leitor.nextLine());

        System.out.println("Digite seu telefone");
        forn.setTelefone(leitor.nextBigInteger());

        System.out.println("Digite o codigo do seu banco");
        forn.setCodigoBanco(leitor.nextInt());

        System.out.println("Digite a sua agencia e, logo em seguida, o digito da agencia");
        forn.setAgencia(leitor.nextInt());
        forn.setDigitoAgencia(leitor.nextInt());

        System.out.println("Digite o numero da conta e, logo em seguida, o digito da conta");
        forn.setNumeroConta(leitor.nextInt());
        forn.setDigitoConta(leitor.nextInt());
        
    }

}
