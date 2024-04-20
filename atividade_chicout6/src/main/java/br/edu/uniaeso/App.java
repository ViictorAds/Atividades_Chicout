package br.edu.uniaeso;

import java.io.*;

public class App { // 6. Implemente um programa Java que leia um arquivo CSV chamado "dados.csv" (com valores separados por vírgula) e exiba cada linha no console, dividida em campos.

    public static void main(String[] args){
        
        BufferedReader arqCSV = null;
        String CSV;


        try {
            arqCSV = new BufferedReader(new FileReader("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout6\\dados.csv"));
            
            while ((CSV = arqCSV.readLine()) != null) {
                String[] CSVL = CSV.split(",");

                System.out.println("Dado 1: " + CSVL[0]);
                System.out.println("Dado 2: " + CSVL[1]);
                System.out.println("Dado 3: " + CSVL[2]);
                System.out.println("");
            }

            arqCSV.close();

        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }
}