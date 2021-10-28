package com.fastfood;

public class Principal {
    public static void main(String[] args) {
        Cardapio c1 = new CardapioAdulto(100.0);
        c1.preparacao();

        System.out.println("\n");

        c1 = new CardapioInfantil(100.0, 30.0);
        c1.preparacao();

        System.out.println("\n");

        c1 = new CardapioVegetariano(100.0);
        c1.preparacao();
    }
}
