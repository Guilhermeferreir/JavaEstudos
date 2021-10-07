package ufc;


public class UFC {

    
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
                
        l[0] = new Lutador("Guilherme", "Alemanha", 20, 1.90f
        , 69.2f, 10, 2, 3);
        
        l[1] = new Lutador("Flavin do pneu", "Brasil", 30, 1.80f
        , 75.3f, 4, 1, 5);
        
        l[2] = new Lutador("Shaolin matador de porco", "Japão", 20, 1.78f
        , 72.3f, 7, 3, 2);
        
        l[3] = new Lutador("Puta que pariu", "Italia", 32, 1.75f
        , 87.3f, 9, 1, 2);
        
        l[4] = new Lutador("Dá minha garrada", "Alemanha", 30, 1.80f
        , 75.3f, 4, 1, 5);
        
        l[5] = new Lutador("Me derrubaram aqui", "Malasia", 38, 1.84f
        , 77.3f, 9, 1, 2);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1], l[4]);
        UFC01.lutar();
    }
    
}
