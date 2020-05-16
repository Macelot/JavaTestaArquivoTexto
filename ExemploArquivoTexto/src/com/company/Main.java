package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            FileWriter fw;
            fw = new FileWriter("arq.txt",true);
            fw.write("Marcelo\n");
            for (int i = 0; i <10 ; i++) {
                fw.write(i+"\n");
            }
            fw.close();
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }
        try {
            FileReader fr;
            fr = new FileReader("arq.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(linha);
            while(linha!=null){
                System.out.println(linha);
                linha = bf.readLine();
            }
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }
    }
}
