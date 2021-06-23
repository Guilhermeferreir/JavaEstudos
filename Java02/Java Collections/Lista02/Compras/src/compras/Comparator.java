package compras;


public class Comparator {
    
    public int compare(Produto produt1, Produto produt2){
        return produt1.getNome().compareTo(produt2.getNome());
    }
    
}
