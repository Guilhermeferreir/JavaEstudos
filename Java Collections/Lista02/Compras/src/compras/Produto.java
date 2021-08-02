package compras;

public class Produto {

    private String nome;
    private Double preco;
    private String codigo;
    
    public Produto(){
        this.codigo = "";
        this.nome = "";
        this.preco = 0.0;
        
    }
    
    Produto(String codigo, String nome, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + '}';
    }

    

}
