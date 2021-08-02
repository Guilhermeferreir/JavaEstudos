package testehashcode;


public class TesteHashCode {

    
    public static void main(String[] args) {
        
        Integer i = 10;
        Integer j = 10;
        
        System.out.println("I: " +i.hashCode());
        System.out.println("J: " +j.hashCode());
        
        String a = "a";
        String b = "b";
        
        System.out.println("A: " +a.hashCode());
        System.out.println("B: " +b.hashCode());
    }
    
}
