package br.edu.uniaeso;

import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivotxt.txt"));
            StringBuilder conteudo = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            reader.close();

            String novoConteudo = conteudo.toString().replace("Java", "Python");

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivo_pythontxt.txt"));
            writer.write(novoConteudo);
            writer.close();

            System.out.println("Palavra substituída com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
            
        }
    }
}
