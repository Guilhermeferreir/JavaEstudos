package lendoparesimpares;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class LendoParesImpares {

    
    public static void main(String[] args) {
        
        FileInputStream leitura = null;
        FileOutputStream pares = null;
        FileOutputStream impares = null;
        
        try{
            leitura = new FileInputStream("leitura.txt");
            pares = new FileOutputStream("pares.txt");
            impares = new FileOutputStream("impares.txt");
            
            int c;
            
            while((c = leitura.read()) != -1){
                if(c % 2 ==0){
                    System.out.println("Par: " + c);
                    pares.write(c);
                }else{
                    System.out.println("Impar: " +c);
                    impares.write(c);
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                leitura.close();
                pares.close();
                impares.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
