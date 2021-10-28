public class Principal {
    public static void main(String[] args) {

        // Criando o primeiro cliente
        ICheckFacade cliente1 = new CheckFacade();

        // Soliciar buscar de voos e hotéis
        cliente1.buscar("19/10/2021", "10/12/2021", "São Paulo", "Salvador");
    }
}
