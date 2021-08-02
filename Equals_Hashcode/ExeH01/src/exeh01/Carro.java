package exeh01;

public class Carro {

    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
 


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelo == null) ? 0: modelo.hashCode());
        return result;

    }

  

}
