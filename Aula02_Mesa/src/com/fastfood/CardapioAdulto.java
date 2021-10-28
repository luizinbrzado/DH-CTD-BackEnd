package com.fastfood;

public class CardapioAdulto extends Cardapio {
    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montar() {
        System.out.println("Sem itens adicionais!");
    }

    @Override
    public double calcularPreco() {
        System.out.println("Valor da venda: " + getPrecoBase());
        return getPrecoBase();
    }
}
