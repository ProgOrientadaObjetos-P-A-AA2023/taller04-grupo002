package paquete02;


public class Cheque {
    
    private String nombreC;
    private String nombreB;
    private double valor;
    private double comision;
    
    public Cheque(String nomC, String nomB, double x) {
        nombreC = nomC;
        nombreB = nomB;
        valor = x;
    }

    
    public String obtenerNombreC() {
        return nombreC;
    }

    
    public String obtenerNombreB() {
        return nombreB;
    }

    
    public double obtenerValor() {
        return valor;
    }

    
    public double obtenerComision() {
        return comision;
    }

    
    public void establecerNombreC(String x) {
        nombreC = x;
    }

    
    public void establecerNombreB(String x) {
        nombreB = x;
    }

    
    public void establecerValor(double x) {
        valor = x;
    }

    
    public void establecerComision() {
        comision = valor* 0.0003;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Comision Cheque\n" // String.format es como un print
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision: %.2f\n",
                obtenerNombreC(),
                obtenerNombreB(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }
}
