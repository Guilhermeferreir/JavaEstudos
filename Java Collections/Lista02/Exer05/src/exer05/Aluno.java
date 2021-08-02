package exer05;
import java.util.Collections;
import java.util.Comparator;


public class Aluno implements Comparable<Aluno>{
    
    public String nome;
    public Integer prontuario;
    
    Aluno(String nome, Integer prontuario){
        this.nome = nome;
        this.prontuario = prontuario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setProntuario(Integer prontuario){
        this.prontuario = prontuario;
    }
    
    public Integer getProntuario(){
        return prontuario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", prontuario=" + prontuario + '}';
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.prontuario.compareTo(outro.getProntuario());
    }

   
   
    

    
  }
    
