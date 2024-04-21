package br.edu.uniaeso;

import java.io.*;

public class App 
{ // 8. Implemente um programa Java que leia o arquivo "meuarquivo.txt" e remova todas as linhas que contêm a palavra "excluir". Salve o resultado em um novo arquivo chamado "meuarquivo_sem_excluir.txt".
    public static void main( String[] args )
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\mruarquivo.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout8\\meuarquivo_sem_excluir.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains("Excluir")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro oo ler ou escrever no arquivo: " + e.getMessage());
        }
    }
}
