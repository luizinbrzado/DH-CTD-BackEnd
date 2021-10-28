package com.company;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Efetivo("Luiz", "Gustavo", "123456789", 10000.0, 4000.0, 1000.0);
        funcionario.pagamentoSalario();

        System.out.println("\n");

        funcionario = new Contratado("Luiz", "Gustavo", "123456789", 12.7, 250);
        funcionario.pagamentoSalario();
    }
}
