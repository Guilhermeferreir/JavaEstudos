package exernumerosint;
import java.lang.Integer;
import java.util.Scanner;
import java.util.ArrayList;
public class ExerNumerosInt {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList lista = new ArrayList();
        
        Integer numero = 0;
        Integer maior = 0;
        Integer menor = 1000;
        
        do{
            System.out.println("Insira os numeros inteiros positivos: ");
            numero = sc.nextInt();
            if(numero > maior){
                maior = numero;
            }
            
            if(numero != 0){
                if(numero < menor){
                 menor = numero;
                }
            }
            if(numero != 0){
                lista.add(numero);
            } 
        }while(!numero.equals(0));
        
        System.out.println("Quantidade de numero na lista: " + lista.size());
        System.out.println("O maior numero: " +maior);
        System.out.println("O menor numero: " +menor);
    }
            
    
    
    
    
}
