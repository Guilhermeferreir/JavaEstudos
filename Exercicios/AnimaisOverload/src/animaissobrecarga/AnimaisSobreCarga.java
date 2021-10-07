package animaissobrecarga;


public class AnimaisSobreCarga {

    
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Cachorro c = new Cachorro();
       
       c.reagir("Salve");
       c.reagir(11, 45);
       c.reagir(19,00);
       
    }
    
}
