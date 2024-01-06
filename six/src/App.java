import poo05.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria leleu = new ContaBancaria();
        leleu.mostrar();
        leleu.abrirConta("CC", "Leao");
        leleu.mostrar();
        leleu.depositar(120.20f);
        leleu.mostrar();
        leleu.sacar(1f);
        leleu.mostrar();
        leleu.pagarMensalidade();
        leleu.mostrar();
    }
}


