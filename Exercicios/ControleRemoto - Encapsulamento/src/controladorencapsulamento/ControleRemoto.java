package controladorencapsulamento;


public class ControleRemoto implements Controlador{
    
    //Atributos 
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais 

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;  
        this.abrirMenu();
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos abstratos 

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == false) {
            System.out.println("Controle Desligado");
        }else {
 
        System.out.println("-------- MENU ----------");
        System.out.println("Controle está ligado ? " + this.getLigado());
        System.out.println("Está tocando ?  " + this.getTocando());
        System.out.print("Volume : " +this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
        
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
           this.setVolume(this.getVolume() +1);
        }
        
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() -1);
        }else{
           
        }
        
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && getVolume() > 0){
            this.setVolume(0);
            
        }
        
    }

    @Override
    public void desligarMudo() {  
        if(this.getLigado() && getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Impossivel reproduzir");
        }
        
    }
   
    @Override
    public void pause() {
        if(this.getLigado() && !(this.getTocando())){
            this.setLigado(false);
            
        }else{
            System.out.println("Impossivel pausar");
        }
        
    }
    
    
    
    
    
    
    
}
