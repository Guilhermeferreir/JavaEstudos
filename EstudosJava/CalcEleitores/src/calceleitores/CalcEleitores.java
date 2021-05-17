package calceleitores;
import java.util.Scanner;


public class CalcEleitores {
    //Algoritmo  para  ler  o  número  total  de  eleitores  de um  município
    // O  número  de  votos brancos, nulos e válidos 
    //Calcular e escrever percentual que cada um representa em relação ao total de eleitores
       
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      float porcentagem=0;
      int total=0;
      int votos=0;
      int nulos=0;
      int validos=0;
      int brancos=0;
      
        System.out.println("Votos Brancos : ");
        brancos = sc.nextInt();
        
        System.out.println("Votos Nulos: ");
        nulos = sc.nextInt();
       
        System.out.println("Votos Validos: ");
        validos = sc.nextInt();
        
        total = brancos + nulos + validos;
        
        
        brancos = (brancos*100/total);
        System.out.println("Votos Brancos " +brancos+ "%");
        
        nulos = (nulos*100/total);
        System.out.println("Votos Nulos " +nulos+ "%");
        
        validos = (validos*100/total);
        System.out.println("Votos Válidos " +validos+ "%");
    }
    
}
