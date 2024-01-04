public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada)
            System.out.println("Nao rabiscar");
        else
            System.out.println("Rabisca");
    }

    protected void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }


    /*
     * A visibilidade é muito importante: + Public, - Private, # Protected
     */
}
