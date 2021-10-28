package com.fastfood;

public class CardapioInfantil extends Cardapio {

    private double presenteSurpresa;

    public CardapioInfantil(double precoBase, double presenteSurpresa) {
        super(precoBase);
        this.presenteSurpresa = presenteSurpresa;
    }

    @Override
    public void montar() {
        System.out.println("Esse menu tem um presente surpresa de: " + presenteSurpresa);
    }

    @Override
    public double calcularPreco() {
        System.out.println("Valor da venda: " + (getPrecoBase() + presenteSurpresa));
        return getPrecoBase() + presenteSurpresa;
    }
}
