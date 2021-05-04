import java.util.Scanner;
package exmediaaluno;

        
public class ExMediaAluno {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Entre com a primeira nota");
       float a = sc.nextFloat ();
       System.out.println("Entre com a segunda nota");
       float b = sc.nextFloat();
       System.out.println("Entre com a terceira nota");
       float c = sc.nextFloat();
       
       boolean apro = (a+b+c)/3 >= 7.0;
       boolean rec = (a+b+c)/3  >= 5.0;
       boolean recp1 = (a+b+c)/3 < 7.0;
       boolean repro = (a+b+c)/3 < 5.0;
       
       if ((a+b+c)/3 >= 7.0)
           System.out.println("Aluno aprovado" +apro);   
       
        if ((a+b+c)/3 >= 5.0)
                   System.out.println("Aluno de Recuperação" + rec );
         else
            if((a+b+c)/3 < 7.0)
                System.out.println("Aluno de Recuperação fazer prova final" + recp1);
        else
                if((a+b+c)/3 < 5.0)
                    System.out.println("Aluno reprovado" + repro);
        
                  
    }
    
    
}
