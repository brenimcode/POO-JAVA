package poo05;
import java.util.Random;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos:
    /*
     * fecharConta()
     * depositar()
     * sacar()
     */
    
    public ContaBancaria() {
        this.saldo = 0f;    
        this.status = false;
    }

    public void abrirConta(String tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
        if(tipo == "CP"){
            this.saldo = 150f;
        }
        else{
            this.saldo = 50f;
        }
        Random gerador = new Random();
        this.numConta = gerador.nextInt();
        this.status = true;
    }

    public void mostrar(){
        System.out.println("STATUS - " + this.status);
        System.out.println("DONO - " + this.dono);
        System.out.println("NUMCONTA - " + (+this.numConta));
        System.out.println("SALDO - " + this.saldo);
        System.out.println("TIPO - " + this.tipo);
    }

    public void pagarMensalidade(){
        if (this.tipo == "CC") {
            this.saldo-=12f;
        }
        else{
            this.saldo-=20f;
        }
    }

    public void fecharConta(){
            //Nao pode ter dinheiro lá e nao pode ter debito
            if(this.saldo != 0f)
                System.out.println("Nao foi possivel fechar conta: Saldo Positivo ou negativo" + this.saldo);
            else
                this.status = false;
    }

    public void depositar(float dinheiro){
        if(this.status == true)
            this.saldo += dinheiro;
    }

    public void sacar(float grana){
        if(this.status == true){
            if(grana > this.saldo){
                System.out.println("Erro, saldo insuficiente.");
            }
            else{
                System.out.println("Sucesso!");
                this.saldo -= grana;
            }
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}
