package constantesenum;


public class Metodos {
    
    public static void main(String[] args){
        
        usandoConstantes();
        System.out.println("");
        usandoEnum();
    
     }
    
    private static void usandoConstantes(){
        int segunda = ConstantesEnum.SEGUNDA;
        int terca = ConstantesEnum.TERCA;
        int quarta = ConstantesEnum.QUARTA;
        int quinta = ConstantesEnum.QUINTA;
        int sexta = ConstantesEnum.SEXTA;
        int sabado = ConstantesEnum.SABADO;
        int domingo = ConstantesEnum.DOMINGO;
        
        System.out.println("-- Constantes --");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
    }
    
    private static void imprimiDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
            break;
            case 2:
                System.out.println("Terça-Feira");
            break;
            case 3:
                System.out.println("Quarta-Feira");
            break;
            case 4:
                System.out.println("Quinta-Feira");
            break;
            case 5:
                System.out.println("Sexta-Feira");
            break;
            case 6:
                System.out.println("Sabado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
        }
    }
    
    // Mesmo codigo mas feito com Enum
    
    private static void usandoEnum(){
        
        System.out.println("-- Enum --");
        
        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;
        
        
        
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
       
    }
    
    private static void imprimiDiaSemana(DiaSemanaEnum dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-Feira");
            break;
            case TERCA:
                System.out.println("Terça-Feira");
            break;
            case QUARTA:
                System.out.println("Quarta-Feira");
            break;
            case QUINTA:
                System.out.println("Quinta-Feira");
            break;
            case SEXTA:
                System.out.println("Sexta-Feira");
            break;
            case SABADO:
                System.out.println("Sabado");
            break;
            case DOMINGO:
                System.out.println("Domingo");
            break;
        
    }
    
    } 
    
}

    