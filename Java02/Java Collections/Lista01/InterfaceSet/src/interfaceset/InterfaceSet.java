package interfaceset;
import java.util.HashSet;

public class InterfaceSet {

    
    public static void main(String[] args) {
        
        HashSet<String> lista = new HashSet<String>();
        
        lista.add("Shape Santa cruz");
        lista.add("Shape flip");
        lista.add("Roda Speedfire");
        lista.add("Truck Strong");
        lista.add("Truck Strong");
        lista.add("Shape flip");
        
        for(String x: lista){
            System.out.println(x);
        }
        
        
        
    }
    
}
