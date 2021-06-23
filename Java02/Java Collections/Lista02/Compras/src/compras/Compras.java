package compras;
import java.util.ArrayList;

public class Compras {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("1", "Notebook", 4000.00);
        Produto p2 = new Produto("2", "Celular", 2000.00);
        Produto p3 = new Produto("3", "Sony A7x", 6000.00);
        Produto p4 = new Produto("4", "Prancha OG Flyer", 3500.00);
        
        CarrinhoCompras carro = new CarrinhoCompras();
        
        carro.adicionarProduto(p1);
        carro.adicionarProduto(p2);
        carro.adicionarProduto(p3);
        carro.adicionarProduto(p4);
        carro.MostrarProdutos();
        
        carro.removerProduto(p2);
        carro.removerProduto(p3);
        carro.MostrarProdutos();
        

        
        

    }

}
