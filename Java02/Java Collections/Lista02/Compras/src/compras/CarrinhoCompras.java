package compras;

import java.util.ArrayList;

public class CarrinhoCompras extends Produto {

    public ArrayList<Produto> itens;

    CarrinhoCompras(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    CarrinhoCompras() {
        this.itens = itens;
    }


    public void adicionarProduto(Produto produt) {
        this.itens.add(produt);
    }

    public void removerProduto(Produto produt) {
        this.itens.remove(produt);

    }

    public void MostrarProdutos() {
        Double ValorTotal = 0.0;
        
        if (itens.isEmpty()) {
            System.out.println("Item inexistente");
        } else {
            for (Produto produt : itens) {
                System.out.println(produt.toString());
                ValorTotal += produt.getPreco();
            }
            System.out.println("Total de :" + ValorTotal);
        }

    }
}
