package paquete01;

import paquete02.Vehiculo;


public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("1960874320","Ferrari", 2000, 30000);
        
        
        v.establecerValorMatricula();
        
        System.out.printf("%s\n", v);
        
        
        Vehiculo v2 = new Vehiculo("1919843168","Toyota", 2005, 38000);
        
        
        v2.establecerValorMatricula();
        
        System.out.printf("%s\n", v2);
    }
    
}
