package ordenaralunos_comparable;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenarAlunos_Comparable {

    
    public static void main(String[] args) {
        
        ArrayList<Aluno> diario = new ArrayList<Aluno>();
        
        diario.add(new Aluno("Priscila", 18));
        diario.add(new Aluno("Maria", 19));
        diario.add(new Aluno("Guilherme", 22));
        diario.add(new Aluno("Ana", 18));
        
        Collections.sort(diario);
        
        for(Aluno x: diario)
            System.out.println(x.getNome() + " - " + x.getIdade());
        
    }
    
}
