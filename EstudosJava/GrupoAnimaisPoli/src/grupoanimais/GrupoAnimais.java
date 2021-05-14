package grupoanimais;

public class GrupoAnimais {

   
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();   
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        
        
        Cachorro c = new Cachorro();
        Iguana igua = new Iguana();
        Tucunare tuc = new Tucunare();
        Gaviao g = new Gaviao();
        
        c.locomover();
        c.emitirSom();
        c.alimentar();
        
    }
    
}
