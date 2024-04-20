package br.edu.uniaeso;

import java.io.*;

public class App 
{
    public static void main( String[] args ) // (2ª) Crie um programa Java que leia o arquivo "meuarquivo.txt" criado na pergunta anterior e exiba seu conteúdo no console.
    {
        String phrase = null;

        try {
            FileReader fileReader = new FileReader("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivotxt.txt");
            System.out.println("File found");   
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            phrase = bufferedReader.readLine();
            System.out.println(phrase);
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivotxt.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nIsso é uma adição!");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
