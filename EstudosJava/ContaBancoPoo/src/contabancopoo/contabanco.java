package contabancopoo;


class contabanco {
     //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
   // Metodos personalizados 
    
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
        
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
        if ("Conta corrente".equals(t)) {
            this.setSaldo(50);
    } else if("Conta poupança".equals(t)) {
          this.setSaldo(150);
     }
        System.out.println("---------------------------");
        System.out.println("Conta aberta");
       
            
    }
    public void fecharConta(){
        if(this.getSaldo() >0){
            System.out.println("Conta não pode ser fechada contem dinheiro!");
            
        } else if(this.getSaldo() <0){
            System.out.println("Conta não pode ser fechada contem debito!");
            
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        } 
         
            
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " +this.getDono());
            
        } else {
            System.out.println("Impossivel depositar, conta fechada");
        }
            
            
    }
    public void sacar(float v){
        if (getStatus()){
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() -v);
               System.out.println("Saque realizado");
               
           } else {
               System.out.println("Saldo insuficiente");
           }
            
        }else {
            System.out.println("Conta fechada");
        }
        
           
    }
      public void pagarMensar(){
          int v = 0;
          if (this.getTipo() == "Conta corrente") {
              v = 12;
              
          } else if(this.getTipo() == "Conta poupança") {
              v = 20;
              
          }
          if(this.getStatus()){
              this.setSaldo(this.getSaldo() -v);
              System.out.println("Mensalidade paga");
        }else{
              System.out.println("Conta fechada!");
          }
            
    }
        
     //Metodos Especiais 

     public contabanco() {
         this.saldo = 0; 
         this.status = true;
            
       }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
        
           
}
    

