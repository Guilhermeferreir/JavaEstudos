package animaissobrecarga;


public class Cachorro extends Lobo {
    
    @Override 
    public void emitirSom(){
        System.out.println("AU AU AU");
        
    }
    public void reagir(String frase){
        if("Toma comida".equals(frase) || "Salve".equals(frase)){
            System.out.println("Abanando e latindo");
        } else{
            System.out.println("Rosnando e latindo");
        }
        
    }
    
    public void reagir(int hora, int min){
        if(hora <12){
            System.out.println("Abanando");
        }else if(hora >=18){
            System.out.println("Ignorando");
        }else {
            System.out.println("Abanando e latindo ");
        }
        
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanando para o dono");
        }else{
            System.out.println("Rosnando e latindo");
        }
        
    }
    public void reagir(int idade, float peso){
        if(idade<10){
            System.out.println("Rosnando");
        }else {
            System.out.println("Ignorando");
        }
        
        
    }
    
}
