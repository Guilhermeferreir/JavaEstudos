package localdate;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;
public class ExercLocalDate {

    
    public static void main(String[] args) {
        String nome;
        Integer ano, mes, dia;
        
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, LocalDate> hp = new HashMap<String, LocalDate>();
        
        int x;
        do{
            System.out.println("Nome: ");
            nome = sc.next();
            
            System.out.println("---- Datas -----");
            System.out.println("Insira o Ano: ");
            ano = sc.nextInt();
            
            System.out.println("Insira o Mês: ");
            mes = sc.nextInt();
            
            System.out.println("Insira o Dia: ");
            dia = sc.nextInt();
            
            LocalDate data = LocalDate.of(ano, mes, dia);
            
            hp.put(nome, data);
            System.out.println("Adicionar outra pessoa n0 -Não 1 -Sim");
            x = sc.nextInt();
            
        }while(x == 1);
        
        Set<String> keys = hp.keySet();
        
        for(String y: keys){
            System.out.println(y + " - " + hp.get(y));
        }
        sc.close();
    }
    
}