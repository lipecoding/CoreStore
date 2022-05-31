package CRUD.contrato;

public class Contrato {
    private boolean aceite;
    private String textoContrato;

    public void setTextoContrato(String textoContrato){
        this.textoContrato = textoContrato;
    }
    public String getTextoContrato(){
        return this.textoContrato;
    }
    public boolean aceite(String aceite){
        if (aceite.equals("OK")){
        return true;
        }else
        return false;
    }
}
