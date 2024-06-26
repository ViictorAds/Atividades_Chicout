package br.edu.uniaeso;

import java.io.*;

class Pessoa implements Serializable {
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
}

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rodolfo", 30);

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivo.txt\\pessoa.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(pessoa);
            System.out.println("Criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao tentar criar: " + e.getMessage());
        }
    }
}