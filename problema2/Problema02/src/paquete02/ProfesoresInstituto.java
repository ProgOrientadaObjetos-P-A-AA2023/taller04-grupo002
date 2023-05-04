package paquete02;


public class ProfesoresInstituto {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public ProfesoresInstituto(String nom, String apell, double sueldoB, String ced) {
        nombre = nom;
        apellido = apell;
        sueldoBasico = sueldoB;
        cedula = ced;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    
    public String obtenerApellido() {
        return apellido;
    }

    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    
    public String obtenerCedula() {
        return cedula;
    }

    
    public void establecerNombre(String x) {
        nombre = x;
    }

    
    public void establecerApellido(String x) {
        apellido = x;
    }

    
    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }

    
    public void establecerSueldoTotal() {
       sueldoTotal = (sueldoBasico * 0.20)+ sueldoBasico;
    }

    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Profesor Instituto\n" // String.format es como un print
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo basico: %.2f\n"
                + "Suseldo total: %.2f\n"
                + "Cedula : %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
              obtenerCedula());
        return cadena;
    }
}
