package seguimiento3.ejercicio2;

public
class Main {
    public static
    void main(String[] args) {
        // Estudiante con los atributos básicos
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", 10, 15, 8.5, "María López", "Carlos Pérez");

        // Estudiante con los atributos básicos + 1 teléfono de contacto
        Estudiante estudiante2 = new Estudiante("Ana", "García", 9, 14, 9.2, "Laura Gómez", "Miguel García", "2659076");

        // Estudiante con los atributos básicos + 2 teléfonos de contacto
        Estudiante estudiante3 = new Estudiante("Luis", "Martínez", 11, 17, 7.8, "Carmen Rodríguez", "Jorge Martínez"
                , "7409087", "5457893");

        // Imprimir los valores de cada estudiante
        System.out.println("Información de los estudiantes:");
        estudiante1.imprimirInfo();
        System.out.println();

        estudiante2.imprimirInfo();
        System.out.println();

        estudiante3.imprimirInfo();
    }
}
