package br.edu.uniaeso;

import java.io.File;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int count = 0;

        try {
            File file = new File("C:\\Users\\Victor\\Desktop\\Uniaeso\\1- Desenvolvimento de Software II\\Exercicios&Atividades\\atividade_chicout1\\meuarquivotxt.txt");
            
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total de linhas no arquivotxt: " + count);

            sc.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
