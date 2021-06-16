package futebol;

import java.util.Objects;

public class Jogador {

    private String nome;
    private int idade;
    private int numero;

    public Jogador (){
    this.nome = "";
    this.idade = 0;
    this.numero = 0;
}
    public Jogador(String nome,Integer idade, Integer numero) {
    this.nome = nome;
    this.idade = idade;
    this.numero = numero;
}


    public void apresentar(){
        System.out.println("nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Numero: " +numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", idade=" + idade + ", numero=" + numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + this.idade;
        hash = 73 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

}
