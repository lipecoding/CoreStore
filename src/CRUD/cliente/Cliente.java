package CRUD.cliente;

public class Cliente{
    private String nome, sobrenome, endereco, email, cpf, senha;
    private int idade;
    public String telefone, cep;

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

    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public void setIdade(int idade){
        if(idade >= 18){
            this.idade = idade;
        }else{
        System.out.println("--!!!Voce deve ser maior de 18 anos!!!--");
        System.exit(0);
        }
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }




    

    
}