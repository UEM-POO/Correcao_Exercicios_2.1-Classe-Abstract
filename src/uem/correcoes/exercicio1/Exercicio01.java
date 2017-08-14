
package uem.correcoes.exercicio1;

/**
 *
 * @author José Seie
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        FabricaLampada fl;
        
        fl = new FabricaLampada();
        Object l = fl.construir("b");
        
        if(l instanceof FabricaLampada.Incandescente){
            ((FabricaLampada.Incandescente) l).ligar();
            ((FabricaLampada.Incandescente) l).desligar();
        }
        if(l instanceof FabricaLampada.Fluorescente){
            ((FabricaLampada.Fluorescente) l).ligar();
            ((FabricaLampada.Fluorescente) l).desligar();
        }
    }
}
