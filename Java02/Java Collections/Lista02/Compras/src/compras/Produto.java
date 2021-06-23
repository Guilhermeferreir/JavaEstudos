package compras;

public class Produto {

    public String nome;
    public Double preco;
    public String codigo;
    
    public Produto(){
        this.codigo = "codigo";
        this.nome = "";
        this.preco = 0.0;
        
    }
    
    Produto(String codigo, String nome, double preco) {
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

    

}
