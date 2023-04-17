package org.example.facts;


public class Pessoa{
    private String nome;
    private int idade;

    private String comidaPref;

    private double rendimento;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String comidaPref) {
        this.nome = nome;
        this.idade = idade;
        this.comidaPref = comidaPref;
    }

    public Pessoa(String nome, int idade, String comidaPref, double rendimento) {
        this.nome = nome;
        this.idade = idade;
        this.comidaPref = comidaPref;
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getComidaPref() {
        return comidaPref;
    }

    public void setComidaPref(String comidaPref) {
        this.comidaPref = comidaPref;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}