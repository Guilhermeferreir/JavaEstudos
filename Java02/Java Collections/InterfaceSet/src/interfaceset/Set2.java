package interfaceset;
import java.util.HashSet;

public class Set2 {
    
    public static void main(String[] args){
        
        HashSet<String> lista = new HashSet<String>();
        
        lista.add("Shape Santa cruz");
        lista.add("Shape flip");
        lista.add("Roda Speedfire");
        lista.add("Truck Strong");
        
        // Verificar se o shape flip existe, retornando true
        Boolean x = lista.contains("Shape flip");
        //System.out.println(x);
        
        Boolean y = lista.remove("Truck Strong");
        //System.out.println(y);
        
        for(String d: lista){
            System.out.println(d);
        }
        
        
        
        
    }
    
}
