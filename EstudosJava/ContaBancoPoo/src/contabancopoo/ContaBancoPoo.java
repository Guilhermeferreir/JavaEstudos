package contabancopoo;

public class ContaBancoPoo {

   
    public static void main(String[] args) {
       contabanco p1 = new contabanco();
       p1.setNumConta(12345);
       p1.setDono("Guilherme Ferreira");
       p1.abrirConta("Conta corrente");
       p1.depositar(500);
       p1.sacar(20);
       p1.estadoAtual();
       
       contabanco p2 = new contabanco();
       p2.setNumConta(23424);
       p2.setDono("Maria Ferreira");
       p2.abrirConta("Conta poupança");
       p2.depositar(1000);
       p2.sacar(100);
       p2.estadoAtual();
       
       contabanco p3 = new contabanco();
       p3.setNumConta(543563);
       p3.setDono("David Sobral");
       p3.abrirConta("Conta poupança");
       p3.depositar(1000);
       p3.sacar(10);
       p3.estadoAtual();
       
       
       
       
       
        
    }
    
}
