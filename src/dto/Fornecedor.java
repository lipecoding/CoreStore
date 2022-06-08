package dto;

public class Fornecedor {
    private String razaoSocial, nomeFantasia, endereco, cnpj, cep, telefone;
    private int codigoBanco, agencia, digitoAgencia, numeroConta, digitoConta;

    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial(){
        return razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia){
        if(nomeFantasia.equals("")){
            this.nomeFantasia = this.razaoSocial;
        }else{
            this.nomeFantasia = nomeFantasia;
        }
        
    }
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }

    public void setCodigoBanco(int codigoBanco){
        this.codigoBanco = codigoBanco;
    }
    public int getCodigoBanco(){
        return this.codigoBanco;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setDigitoAgencia(int digitoAgencia){
        this.digitoAgencia = digitoAgencia;
    }
    public int getDigitoAgencia(){
        return this.digitoAgencia;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    
    public void setDigitoConta(int digitoConta){
        this.digitoConta = digitoConta;
    }
    public int getDigitoConta(){
        return this.digitoConta;
   }

}    

