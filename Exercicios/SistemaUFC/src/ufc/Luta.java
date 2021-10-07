
package ufc;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos publicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())  && l1 != l2){
            
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;          
    }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada) {
            System.out.println("------Lutador desafiante-------");
            this.desafiante.apresentar();
            System.out.println("------Lutador desafiado--------");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0 -> {
                    //Luta que empatou
                    
                    System.out.println(" Luta empatou");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                }
                
                case 1 -> {
                    // Desafiado ganhou a luta
                    System.out.println("Ganhou a luta");
                    System.out.println("Vencedor: " +this.desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                }
                case 2 -> {
                    //Desafiante ganhou a luta 
                    System.out.println("Ganhou a luta");
                    System.out.println("Vencedor " +this.desafiante.getNome());
                    this.desafiado.perderluta();
                    this.desafiante.ganharluta();
                }
            }
            
        } else{
            System.out.println("Luta cancelada");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

   
    
    
}