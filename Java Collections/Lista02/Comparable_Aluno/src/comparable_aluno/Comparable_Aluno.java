package comparable_aluno;
import java.util.ArrayList;
import java.util.Collections;


public class Comparable_Aluno {

    
    public static void main(String[] args) {
        
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        
        lista.add(new Aluno("Guilherme", 12343));
        lista.add(new Aluno("Maria", 49339));
        lista.add(new Aluno("Lucas", 94738));
        
        Collections.sort(lista);
        
        for (Aluno x: lista){
            System.out.println(x.getNome() + " - " + x.getProntuario());
        }
    }

    
}
