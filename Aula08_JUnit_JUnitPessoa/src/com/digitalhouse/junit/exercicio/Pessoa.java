package com.digitalhouse.junit.exercicio;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    // Atributos
    private String nome;
    private String sobrenome;
    LocalDate idade;
    private String email;

    // Construtor

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    // Métodos
    public String calcularNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public boolean isMaiorDeIdade() {
        return Period.between(this.idade, LocalDate.of(2021, 10, 25)).getYears() >= 18;
    }

}
