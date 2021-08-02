package compras;


public class Comparator {
    
    public int compare(Produto o1, Produto o2){
        return o1.getNome().compareTo(o2.getNome());
    }
    
}
