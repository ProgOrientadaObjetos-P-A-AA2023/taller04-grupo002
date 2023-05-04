package paquete02;


public class Vehiculo {
    
    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Vehiculo(String ced, String x, int a, double valorV) {
        cedula = ced;
        marca = x;
        anio  = a;
        valorVehiculo = valorV;
        
    }

    
    public String obtenerCedula() {
        return cedula;
    }

    
    public String obtenerMarca() {
        return marca;
    }

    
    public int obtenerAnio() {
        return anio;
    }

    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    
    public void establecerCedula(String x) {
        cedula = x;
    }

    
    public void establecerMarca(String x) {
        marca = x;
    }

    
    public void establecerAnio(int x) {
        anio = x;
    }

    
    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }

    
    public void establecerValorMatricula() {
        valorMatricula = (valorVehiculo * (2023- anio))* 0.0002;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Valor matricula\n" // String.format es como un print
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor Matricula : %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValorVehiculo(),
              obtenerValorMatricula());
        return cadena;
    }
}
