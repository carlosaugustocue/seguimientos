package seguimiento3.ejercicio6;

public
class Main {
    public static void main(String[] args) {
        // Crear array de zapatos
        Zapato[] zapatos = new Zapato[5];
        zapatos[0] = new Zapato("Modelo1", "Cuero", "Negro", "42", 100.0, "Primavera");
        zapatos[1] = new Zapato("Modelo2", "Sintético", "Marrón", "43", 80.0, "Verano");
        zapatos[2] = new Zapato("Modelo3", "Cuero", "Azul", "41", 120.0, "Invierno");
        zapatos[3] = new Zapato("Modelo4", "Gamuza", "Gris", "44", 90.0, "Otoño");
        zapatos[4] = new Zapato("Modelo5", "Tela", "Blanco", "40", 70.0, "Primavera");

        // Crear inventario con 5 entradas
        Inventario[] inventario = new Inventario[5];
        String[] tallas = {"40", "41", "42", "43", "44"};
        for (int i = 0; i < zapatos.length; i++) {
            int[] cantidades = {50, 50, 50, 50, 50}; // Inicializar cada zapato con 50 unidades por talla
            inventario[i] = new Inventario(zapatos[i], tallas, cantidades);
        }

        // Mostrar inventario inicial
        System.out.println("Inventario inicial:");
        for (Inventario inv : inventario) {
            inv.mostrarInventario();
            System.out.println();
        }

        // Simular ventas
        Venta[] ventas = new Venta[2];
        ventas[0] = new Venta("2024-08-10", zapatos[0], "42", 5); // Venta de 5 unidades del modelo 1 talla 42
        ventas[1] = new Venta("2024-08-11", zapatos[2], "41", 10); // Venta de 10 unidades del modelo 3 talla 41

        // Reducir stock según ventas
        for (Venta venta : ventas) {
            for (Inventario inv : inventario) {
                if (inv.getZapato().getNombre().equals(venta.getZapato().getNombre())) {
                    inv.reducirStock(venta.getTalla(), venta.getCantidad());
                }
            }
        }

        // Mostrar ventas
        System.out.println("Ventas realizadas:");
        for (Venta venta : ventas) {
            venta.imprimirDetalle();
            System.out.println();
        }

        // Mostrar inventario después de las ventas
        System.out.println("Inventario después de las ventas:");
        for (Inventario inv : inventario) {
            inv.mostrarInventario();
            System.out.println();
        }
    }
}
