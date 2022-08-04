package Ex02;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args){
        Data d = new Data(22, 7, 2004);
        
        d.setDia(21);
        d.setMes(8);
        d.setAno(1904);
                
        d.imprimir();
    }
}
