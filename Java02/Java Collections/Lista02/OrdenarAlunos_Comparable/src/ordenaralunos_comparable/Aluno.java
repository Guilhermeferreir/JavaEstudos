package ordenaralunos_comparable;

public class Aluno implements Comparable<Aluno> {
    
    public String nome;
    public Integer idade;
    
    public Aluno(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return idade;
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.getNome());
    }

 
}
