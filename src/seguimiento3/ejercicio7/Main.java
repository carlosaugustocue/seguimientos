package seguimiento3.ejercicio7;

public
class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", 1605, "Espasa", 1200, "Clásico");
        Libro libro2 = new Libro("978-0-14-028333-4", "1984", "George Orwell", 1949, "Penguin", 328, "Ciencia Ficción");

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "12345678", "7409084");
        Usuario usuario2 = new Usuario("Ana Gómez", "87654321", "2659076");

        // Crear algunos préstamos
        Prestamo prestamo1 = new Prestamo(libro1.getIsbn(), usuario1.getIdentificacion(), "2024-08-10", "2024-08-24");
        Prestamo prestamo2 = new Prestamo(libro2.getIsbn(), usuario2.getIdentificacion(), "2024-08-11", "2024-08-25");

        // Mostrar información de libros
        System.out.println("Información de los Libros:");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        System.out.println();

        // Mostrar información de usuarios
        System.out.println("Información de los Usuarios:");
        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();
        System.out.println();

        // Mostrar información de préstamos
        System.out.println("Información de los Préstamos:");
        prestamo1.mostrarInformacion();
        System.out.println();
        prestamo2.mostrarInformacion();
    }
}
