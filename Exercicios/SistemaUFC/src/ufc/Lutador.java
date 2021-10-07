package ufc;


public class Lutador {
    //Atributos 
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates; 

    
    // Métodos
    
    public void apresentar(){
        
       
        System.out.println("Lutador " +this.getNome());
        System.out.println("Origem " +this.getNacionalidade());
        System.out.println(this.getIdade() +" anos");
        System.out.println("Altura : " +this.getAltura());
        System.out.println("Pesando " +this.getPeso());
        System.out.println("Categoria  " +this.getCategoria());
        System.out.println(this.getVitorias() +" vitorias");
        System.out.println(this.getDerrotas() +" derrotas");
        System.out.println(this.getEmpates() +" empates");
    
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso" + this.getCategoria() +
                " com " +this.getVitorias() + " vitorias" +this.getDerrotas() + 
                " derrotas e" + this.getEmpates() + "empates" );
           
        
    }
    public void ganharluta(){
        this.setVitorias(this.getVitorias() + 1);
        
    }
    public void perderluta(){
        this.setVitorias(this.getVitorias() -1);
        
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
    //Métodos especiais

    public Lutador(String no, String na, int id, float alt,
                    float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(this.peso < 52.2){
          this.categoria = "Invalido";
        }else if(this.peso <=70.2){
            this.categoria = "Leve";
        }else if(this.peso <= 83.2){
            this.categoria = "Médio";
        }else if(this.peso <=120.2){
            this.categoria = "Pesado";
            
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
    
    
}
