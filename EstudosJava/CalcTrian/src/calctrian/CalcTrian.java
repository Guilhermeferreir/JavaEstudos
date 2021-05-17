package calctrian;
import java.util.Scanner;


public class CalcTrian {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float base=0;
        float altura=0;
        float resultado=0;
        
        System.out.println("----- Calcular Área do Triângulo -----");
        System.out.println("Entre com a base : ");
        base = sc.nextFloat();
        
        System.out.println("Entre com a altura : ");
        altura = sc.nextFloat();
        
        resultado = base * altura/2;
        System.out.println("Seu triângulo tem área de " +resultado);
        
        
        
        
        
    }
    
}
