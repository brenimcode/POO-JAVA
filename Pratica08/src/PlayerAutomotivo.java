public class PlayerAutomotivo implements ReprodutorDisco {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo no player automotivo...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando no player automotivo...");
    }

    @Override
    public void parar() {
        System.out.println("Parando no player automotivo...");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando no player automotivo...");
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocedendo no player automotivo...");
    }
}