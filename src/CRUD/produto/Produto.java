package CRUD.produto;

public class Produto {
    private String nome;
    private String tipo;
    private String plataforma;
    private double precoCusto, precoVenda;
    private String empresaCriadora;
    private int faixaEtaria, quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }

    public void setPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }
    public double getPrecoCusto(){
        return this.precoCusto;
    }

    public void setPrecoVenda(double precoVenda){
        this.precoVenda = precoVenda;
    }
    public double getPrecoVenda(){
        return this.precoVenda;
    }

    public void setEmpresaCriadora(String empresaCriadora){
        this.empresaCriadora = empresaCriadora;
    }
    public String getEmpresaCriadora(){
        return this.empresaCriadora;
    }
    
    public void setFaixaEtaria(int faixaEtaria){
        this.faixaEtaria = faixaEtaria;
    }
    public int getFaixaEtaria(){
        return this.faixaEtaria;
    }
    
}
