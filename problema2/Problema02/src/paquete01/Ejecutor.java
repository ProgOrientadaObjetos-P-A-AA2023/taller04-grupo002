package paquete01;

import paquete02.ProfesoresInstituto;

/**
 *
 * @author Jhonder
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesoresInstituto pf = new ProfesoresInstituto("Rene", "Elizalde",2000,"1930618759");
        
        pf.establecerSueldoTotal();
        
        System.out.printf("%s\n", pf);
        
        
        ProfesoresInstituto pf2 = new ProfesoresInstituto("Jhordy", "Agila",1800,"1913671569");
        
        pf2.establecerSueldoTotal();
        
        System.out.printf("%s\n", pf2);
    }
    
}
