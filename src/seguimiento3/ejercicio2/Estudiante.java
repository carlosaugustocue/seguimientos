package seguimiento3.ejercicio2;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int grado;
    private int edad;
    private double promedioAcademico;
    private String nombreMadre;
    private String nombrePadre;
    private String telefono1;
    private String telefono2;

    // Constructor básico (sin teléfonos)
    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico,
                      String nombreMadre, String nombrePadre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.telefono1 = null;  // Inicializar con null si no se proporciona
        this.telefono2 = null;
    }

    // Constructor sobrecargado 1 (con 1 teléfono)
    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico,
                      String nombreMadre, String nombrePadre, String telefono1) {
        this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
        this.telefono1 = telefono1;
    }

    // Constructor sobrecargado 2 (con 2 teléfonos)
    public Estudiante(String nombres, String apellidos, int grado, int edad, double promedioAcademico,
                      String nombreMadre, String nombrePadre, String telefono1, String telefono2) {
        this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

//     Métodos para imprimir la información del estudiante
    public void imprimirInfo() {
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Grado: " + grado);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio Académico: " + promedioAcademico);
        System.out.println("Nombre de la madre: " + nombreMadre);
        System.out.println("Nombre del padre: " + nombrePadre);
        System.out.println("Teléfono 1: " + (telefono1 != null ? telefono1 : "No registrado"));
        System.out.println("Teléfono 2: " + (telefono2 != null ? telefono2 : "No registrado"));
    }
}
