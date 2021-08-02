package compras;
import java.util.ArrayList;

public class Compras {

    public static void main(String[] args) {
        
        CarrinhoCompras compras = new CarrinhoCompras();
        
        Produto p1 = new Produto("1", "Notebook", 4000.00);
        System.out.println("Cadastrado" +p1.toString());
        
        Produto p2 = new Produto("2", "Celular", 2000.00);
        System.out.println("Cadastrado " +p2.toString());
        
        Produto p3 = new Produto("3", "Sony A7x", 6000.00);
        System.out.println("Cadastrado " +p3.toString());
          
        
        compras.adicionarProduto(p1);
        compras.adicionarProduto(p2);
        compras.adicionarProduto(p3);
        compras.MostrarProdutos();
        
        compras.removerProduto(p2);
        compras.MostrarProdutos();
        

        
        

    }

}
