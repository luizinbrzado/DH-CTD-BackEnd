public class FacadeDesconto implements IFacadeDesconto{

    //Armazenando instância de cada API na memória
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //Construtor que cria as instâncias
    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    public int desconto(Cartao cartao, Produto prod, int qtd) {
        int desconto = 0;

        desconto = desconto + apiQuantidade.desconto(qtd);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }
}
