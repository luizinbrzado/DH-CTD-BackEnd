package com.fastfood;

public abstract class Cardapio {

    private double precoBase;

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    public void preparacao() {
        montar();
        calcularPreco();
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract void montar();
    public abstract double calcularPreco();
}
