package exee01;

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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Carro other = (Carro) obj;

        if (modelo == null) {
            if (other.modelo != null) {
                return false;
            }

        } else if (!modelo.equals(other.modelo)) {
            return false;
        }

        return true;
    }

}
