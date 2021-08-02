package futebol;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;


public class Futebol {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      ArrayList<Jogador> list = new ArrayList<Jogador>();
      Integer idade;
      Integer numero;
      String nome = "";  
      
      do{
            System.out.println("Digite o nome do jogador: ");
            nome = sc.next();
            System.out.println("Digite a idade do jogador: ");
            idade = sc.nextInt();
            System.out.println("Digite o numero do jogador: ");
            numero = sc.nextInt();
            if(numero != 0){
                Jogador j = new Jogador(nome, idade, numero);
                list.add(j);
            }
        } while(! numero.equals(0));
        System.out.println("Os jogadores registrados são: ");
        for(Jogador j: list){
            System.out.println("\n"+j);
        }
         
        
     
        
        
    }
    
}
