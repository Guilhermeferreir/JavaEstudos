package copiandobytes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopiandoBytes {

    
    public static void main(String[] args) {
        
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("entrada.txt");
            out = new FileOutputStream("saida.txt");
            
            int c;
            
            while((c = in.read()) != -1){
                out.write(c);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                in.close();
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
