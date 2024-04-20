package br.edu.uniaeso;

import java.io.*;

public class App // (1ª) Escreva um programa Java que crie um arquivo de texto chamado "meuarquivo.txt" e escreva a mensagem "Olá, mundo!" nele.
{
    public static void main( String[] args )
    {
        File myFile = new File("meuarquivotxt.txt");

        try {
            myFile.createNewFile();
            System.out.println("File create succesfully");
        } catch (IOException e) {
            System.out.println("File not created");
        }

        try {
            FileWriter fileWriter = new FileWriter("meuarquivotxt.txt");
            BufferedWriter bufferRedWriter = new BufferedWriter(fileWriter);

            bufferRedWriter.write("Hello, World!");
            bufferRedWriter.close();

        } catch (IOException e) {
            System.out.println("Error typing in file");
            System.out.println();
        }
    }
}
