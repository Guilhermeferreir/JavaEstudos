package exeh01;


public class ExeH01 {

    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Palio");
        Carro c2 = new Carro("Gol");
        Carro c3 = new Carro("Gol");
        
        System.out.println("c1: " +c1.hashCode());
        System.out.println("c2: " +c2.hashCode());
        System.out.println("c3: " +c3.hashCode());
        
        
    }
    
}
