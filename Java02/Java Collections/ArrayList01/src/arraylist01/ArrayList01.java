package arraylist01;
import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("Shape Santa cruz");
        lista.add("Shape flip");
        lista.add("Roda Speedfire");
        lista.add("Truck Strong");
        
        for(String x: lista){
            System.out.println(x);
            
            
        }
    }
    
}
