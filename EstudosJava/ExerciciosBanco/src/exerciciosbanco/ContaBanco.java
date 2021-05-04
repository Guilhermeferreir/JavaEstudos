package exerciciosbanco;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    public boolean status; 
    public String abrirConta;
    public String fecharConta;
    public String depositar;
    public String sacar;
    public String pagarMensal;
    
    
    
    
    
    public void AbrirConta(String t){
        this.setTipo(t);
        this.setStatus = true;
        if(t == "CC"){
            this.setSaldo = 50;
        }else if("CC".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
        
    }
        
    
     public void FecharConta(){
         if(this.getSaldo() > 0){
             System.out.println("Conta com dinheiro");
         }else if (this.getSaldo() <  0){
             System.out.println("Conta tem débito");
         }else{
             this.setStatus(false);
             System.out.println("Conta fechada");
         }
        
    } 
   
    
    public void Depositar(float v){
      if(this.getStatus()) {
          this.setSaldo = this.setSaldo +v;
      }
    }
      
   
    
    public String getSacar(){
        return this.sacar;
    } 
    public void setSacar(String sd){
        this.abrirConta = sd;
    }
    
    
    public String getPagarMensal(){
        return this.pagarMensal;
    } 
    public void setPagarMensal(String pm){
        this.pagarMensal = pm;
    }
    
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
        
    }
    public int getNumConta(){
      return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    protected String getTipo(){
        return this.tipo;
    } 
    protected void setTipo(String t){
        this.tipo = t;
    }
    
    
    private String getDono(){
        return this.dono;
    } 
    private void setDono(String d){
        this.dono = d;
    }
    
    
    private double getSaldo(){
        return this.saldo;
    } 
    private void setSaldo(double s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
      
    }
    

    public void setStatus(boolean status) {
       this.status = status;
    }
    
        
    
  
    
    
    
}  
    

