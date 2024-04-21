package br.edu.uniaeso;

import java.io.*;

class Pessoa implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}

public class App {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout12\\pessoa.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Pessoa pessoa = (Pessoa) ois.readObject();
            System.out.println("Detalhes da pessoa: " + pessoa.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}