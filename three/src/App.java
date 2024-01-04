public class App {
    public static void main(String[] args) throws Exception {
        Caneta caca = new Caneta();
        caca.modelo = "Pentel";
        caca.tampada = false;
        caca.carga = 1; 
        caca.cor = "Blue";
        caca.status();
    }
}
