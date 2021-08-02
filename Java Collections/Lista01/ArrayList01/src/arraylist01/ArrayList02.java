package arraylist01;

import java.util.ArrayList;

public class ArrayList02 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Shape Santa cruz");
        lista.add("Shape flip");
        lista.add("Roda Speedfire");
        lista.add("Truck Strong");

        String x = lista.get(1);

        //System.out.println(x);
        //Descobrir posição do elemento
        Integer y = lista.indexOf("Roda Speedfire");
        //System.out.println(y);

        //Sobrepor uma informação dentro do vetor
        lista.set(1, "Parafusos diamond");

        String j = lista.get(1);
        //System.out.println(j);

        lista.remove("Truck Strong");
        for (String k : lista) {
            System.out.println(k);
        }

    }

}
