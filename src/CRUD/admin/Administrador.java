package CRUD.admin;

import java.math.BigInteger;

public class Administrador{
    private String nome, sobrenome, endereco, email, cargo, cpf;
    private int idade, senha;
    private BigInteger cep, telefone;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
    public int getSenha(){
        return this.senha;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setTelefone(BigInteger telefone){
        this.telefone = telefone;
    }
    public BigInteger getTelefone(){
        return this.telefone;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setCep(BigInteger cep){
        this.cep = cep;
    }
    public BigInteger getCep(){
        return this.cep;
    }

}