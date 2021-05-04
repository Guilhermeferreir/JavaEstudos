package aulametodos;


public class Caneta {
    public String modelo;
    private float ponta;
    public String cor;
    
    
    public String getModelo(){
       return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
        
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void status(){
        System.out.println("Sobre a caneta ");
        System.out.println("--------------");
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta :" +this.ponta);
        System.out.println("Cor : " +this.cor);
    }
}
