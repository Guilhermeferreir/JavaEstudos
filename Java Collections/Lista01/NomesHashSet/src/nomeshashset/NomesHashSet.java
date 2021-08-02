package nomeshashset;

import java.util.HashSet;
import java.util.Scanner;

public class NomesHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> lista = new HashSet<String>();

        String palavra;

        System.out.println("Insira palavras ou fim para encerrar: ");

        do {
            palavra = sc.next();

            if (!palavra.equals("fim")) {
                lista.add(palavra);
            }

        } while(!palavra.equals("fim"));
        
            System.out.println("Pesquise palavra ou fim para encerrar: ");

            do {
                palavra = sc.next();

                if (!palavra.equals("fim")) {
                    if (lista.contains(palavra)) 
                        System.out.println(palavra + " - Localizado");
                    else
                        System.out.println(palavra +" - Não localizado");
                }
                
            }while (!palavra.equals("fim"));
    }
    }

            
            
    
        
