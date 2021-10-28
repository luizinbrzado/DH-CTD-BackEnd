public class Supermercado {
    public static void main(String[] args) {
        //Instanciando o objeto facade da classe FacadeDesconto
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("1231456478971231", "Star Bank");
        Produto produto = new Produto("Feijão", "Lata");

        System.out.println("O valor do desconto será: " + facade.desconto(cartao, produto, 15) + "%");
    }
}
