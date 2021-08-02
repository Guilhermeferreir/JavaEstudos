package comparable_aluno;


public class Aluno implements Comparable<Aluno>{
    
    public String nome;
    public String email;
    public Integer prontuario;

    public Aluno(String nome, Integer prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", prontuario=" + prontuario + '}';
    }
    
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.getNome());
    }
    
    
    
    
    
}
