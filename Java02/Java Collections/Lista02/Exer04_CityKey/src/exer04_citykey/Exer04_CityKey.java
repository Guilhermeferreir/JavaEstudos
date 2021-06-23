package exer04_citykey;

import java.util.HashMap;
import java.util.Set;

public class Exer04_CityKey {

    public static void main(String[] args) {

        HashMap<Integer, String> cidades = new HashMap<Integer, String>();

        String cidade1 = "Santos";
        String cidade2 = "Fortaleza";

        cidades.put(cidade1.length(), cidade1);
        cidades.put(cidade2.length(), cidade2);
        cidades.put("Campinas".length(), "Campinas");

        Set<Integer> chaves = cidades.keySet();

        for (Integer x : chaves) {
            System.out.println(x + " - " + cidades.get(x));
        }
        cidades.remove(cidade1.length());
        cidades.remove("Campinas".length());

        System.out.println("------------------------");

        for (Integer x : chaves) {
            System.out.println(x + " - " + cidades.get(x));
        }

    }
}
