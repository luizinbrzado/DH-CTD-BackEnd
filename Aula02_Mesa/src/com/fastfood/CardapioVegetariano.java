package com.fastfood;

public class CardapioVegetariano extends Cardapio {
    public CardapioVegetariano(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montar() {
        System.out.println("Possui contêiner diferente!");
    }

    @Override
    public double calcularPreco() {
        System.out.println("Valor da venda: " + (getPrecoBase() + 1.01));
        return getPrecoBase() * 1.01;
    }
}
