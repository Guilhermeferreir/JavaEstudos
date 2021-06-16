package exer05;
import java.util.ArrayList;
import java.util.Collections;


public class Exer05 {

    
    public static void main(String[] args) {
            
        ArrayList<Aluno> diario = new ArrayList<Aluno>();
        
        diario.add(new Aluno("Priscila", 18454));
        diario.add(new Aluno("Maria", 19984));
        diario.add(new Aluno("Guilherme", 22385));
        diario.add(new Aluno("Ana", 18294));
        
        Collections.sort(diario);        
        
        for(Aluno x: diario){
            System.out.println(x.getProntuario() + " - " + x.getNome());
        }
    }
    
}
