
package uem.correcoes.exercicio1;

/**
 *
 * @author José Seie
 */
public class FabricaLampada {
    
    public class Incandescente implements Lampada{
        @Override
        public void ligar() {
            System.out.println("Lampada Incandescente a) ligada.");
        }

        @Override
        public void desligar() {
            System.err.println("Lampada Incandescente a) desligada.");
        }
    }
    
    public class Fluorescente implements Lampada{

        public Fluorescente() {}     

        @Override
        public void ligar() {
            System.out.println("Lampada Fluorescente b) ligada.");
        }

        @Override
        public void desligar() {
            System.err.println("Lampada Fluorescente b) desligada.");
        }
    }
    
    public Object construir(String tipo){ 
        if(tipo.equalsIgnoreCase("a"))
            return new Incandescente();
        return new Fluorescente();
    }
       
}
