public class VooApi {

    // Procurar os voos de acordo com uma data predefinida
    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        System.out.println("====================");
        System.out.println("Voos encontrados para " + destino + " saindo de " + origem);
        System.out.println("Data de partida: " + dataPartida + " - Data de retorno: " + dataRetorno);
    }
}
