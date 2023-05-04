package paquete01;

import paquete02.Cheque;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheque cq = new Cheque("Italo", "Banco de Loja", 25000);
        
        cq.establecerComision();
        
        System.out.printf("%s\n", cq);
        
        Cheque cq2 = new Cheque("Romeo", "Banco Pichincha", 10500);
        
        cq2.establecerComision();
        
        System.out.printf("%s\n", cq2);
    }
    
}
