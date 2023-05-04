package paquete02;

/**
 *
 * @author Jhonder
 */
public class Estudiante {
    
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    
    
    public Estudiante(String nom, double mat1, double mat2, double mat3) {
        nombre = nom;
        materia1 = mat1;
        materia2 = mat2;
        materia3 = mat3;
    }
    
    
    public String obtenerNombre() {
        return nombre;
    }

    
    public void obtenerNombre(String x) {
        nombre = x;
    }

    
    public double obtenerMateria1() {
        return materia1;
    }
    
    
    public void establecerMateria(double x) {
        materia1 = x;
    }

    
    public double obtenerMateria2() {
        return materia2;
    }

    
    public void establecerMateria2(double x) {
        materia2 = x;
    }

    
    public double obtenerMateria3() {
        return materia3;
    }

    
    public void establecerMateria3(double x) {
        materia3 = x;
    }

    
    public double obtenerPromedio() {
        return promedio;
    }

    
    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3)/3;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Los notas del estudiante\n" // String.format es como un print
                + "Nombre: %s\n"
                + "Materia1: %.2f\n"
                + "Materia2: %.2f\n"
                + "Materia3: %.2f\n"
                + "Promedio : %.2f\n",
                obtenerNombre(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
              obtenerPromedio());
        return cadena;
    }
    
}
