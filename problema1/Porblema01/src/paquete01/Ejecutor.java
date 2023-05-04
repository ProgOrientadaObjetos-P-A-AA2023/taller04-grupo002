package paquete01;

import paquete02.Estudiante;


public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Andrea",7.5,6.9,8.7) ;
            
            est.calcularPromedio();
            
            System.out.printf("%s\n", est);
            
        Estudiante est2 = new Estudiante("Andy",7.9,8.9,8.5) ;
            
            est2.calcularPromedio();
            
            System.out.printf("%s\n", est2);
        
    }
    
}
