package exer03_alunomap;
import java.util.HashMap;


public class Exer03_AlunoMap {

    
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        
        mapa.put(1, "Guilherme");
        mapa.put(2, "Maria");
        mapa.put(3,"Ronaldinho");
        
        mapa.remove(2, "Maria");
        mapa.remove(3, "Ronaldinho");
        
        System.out.println(mapa);
    }
    
}
