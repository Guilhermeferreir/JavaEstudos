package compras;

import java.util.ArrayList;

public class CarrinhoCompras extends Produto {

    private ArrayList<Produto> itens;

    public CarrinhoCompras(){
        itens = new ArrayList<Produto>();
    }
    
    public CarrinhoCompras(ArrayList<Produto> itens){
        this.itens = itens;
    }


    public void adicionarProduto(Produto p) {
        this.itens.add(p);
    }

    public void removerProduto(Produto p) {
        this.itens.remove(p);

    }

    public void MostrarProdutos() {
        System.out.println("Lista de Produtos");
        
        Double ValorTotal = 0.0;
        
        if(!itens.isEmpty()){
            for(Produto produto : itens){
                System.out.println(produto.toString());
                
                ValorTotal += produto.getPreco();
            }
        }
        else{
            System.out.println("Lista vazia");
        }
        System.out.println("Valor total: " +ValorTotal);
        
        

    }
}
