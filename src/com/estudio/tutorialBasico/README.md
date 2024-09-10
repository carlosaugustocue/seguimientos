
# Tutorial Java

### **[Tutorial de Java: Conceptos Fundamentales]**

---

## **Autores:**

- **Nombre Completo del Autor 1**  
  Estudiante de Ingeniería de Software  
  [Corporacion Universitaria Alexander Von Humboldt]  
  Email: @cue.edu.co

- **Nombre Completo del Autor 2**  
  Estudiante de Ingeniería de Software  
  [Corporacion Universitaria Alexander Von Humboldt]  
  Email: @cue.edu.co

---

## **Resumen**

Este tutorial tiene como objetivo proporcionar una guía completa y exhaustiva sobre los principales conceptos del lenguaje de programación Java, tanto para principiantes como para aquellos que deseen profundizar en temas más avanzados. Se abarcarán aspectos fundamentales como tipos de datos, estructuras de control, clases, métodos, y herencia, así como conceptos más avanzados como polimorfismo, clases abstractas, interfaces, y la gestión dinámica de datos con `ArrayList`. Este documento está diseñado como material de apoyo para el estudio autodidacta y para servir como referencia en entornos académicos.

---

## **Palabras Clave:**

Java, Clases, Métodos, Polimorfismo, Herencia, Programación Orientada a Objetos (POO), ArrayList, Arrays, Interfaces, Abstractas

---

## **Introducción**

Java es uno de los lenguajes de programación más populares y ampliamente utilizados en el mundo del desarrollo de software. Gracias a su enfoque en la **Programación Orientada a Objetos (POO)**, Java permite la creación de aplicaciones escalables, mantenibles y seguras. Este tutorial explora los fundamentos del lenguaje Java y proporciona una comprensión sólida de cómo aplicar estos conceptos para desarrollar soluciones efectivas en el ámbito de la programación.


## 1. Tipos de Datos y Clases Wrapper en Java

### Tipos de Datos Primitivos:
Java ofrece ocho tipos de datos primitivos:
- **byte**: 8 bits, rango [-128, 127]
- **short**: 16 bits, rango [-32,768, 32,767]
- **int**: 32 bits, rango [-2^31, 2^31-1]
- **long**: 64 bits, rango [-2^63, 2^63-1]
- **float**: 32 bits, precisión simple
- **double**: 64 bits, precisión doble
- **char**: 16 bits, caracteres Unicode
- **boolean**: `true` o `false`

### Clases Wrapper:
Las clases wrapper permiten trabajar con tipos primitivos como si fueran objetos. Las clases wrapper para cada tipo son:
- `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`

### Ejemplo:
```java
int num = 5;
Integer numWrapper = Integer.valueOf(num);
```

---

## 2. Estructuras de Control en Java

### Condicionales:
- **if-else**:
```java
if (condicion) {
    // Bloque de código
} else {
    // Otro bloque
}
```

- **switch**:
```java
switch (variable) {
    case valor1:
        // Código
        break;
    case valor2:
        // Código
        break;
    default:
        // Código
}
```

### Bucles:
- **for**:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

- **while**:
```java
while (condicion) {
    // Código
}
```

- **do-while**:
```java
do {
    // Código
} while (condicion);
```

---

## 3. Clases, Métodos, Atributos e Instancias en Java

### Definición de Clases:
Una clase es una plantilla para crear objetos.
```java
class Persona {
    String nombre;
    int edad;
    
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
```

### Atributos:
Son variables que representan las propiedades de un objeto.

### Métodos:
Son funciones definidas dentro de una clase que representan el comportamiento de un objeto.

### Instancias:
Crear un objeto a partir de una clase:
```java
Persona persona1 = new Persona();
```

---

## 4. Modificadores de Acceso (public, protected, private)

### Public:
El miembro es accesible desde cualquier lugar.
```java
public String nombre;
```

### Private:
El miembro solo es accesible dentro de su propia clase.
```java
private int edad;
```

### Protected:
Accesible en su clase, paquete y subclases.
```java
protected String direccion;
```

---

## 5. Final en Clases, Métodos y Atributos

### Final en Clases:
Evita que una clase sea heredada.
```java
final class MiClase {
    // Código
}
```

### Final en Métodos:
Previene que un método sea sobrescrito por subclases.
```java
final void metodo() {
    // Código
}
```

### Final en Atributos:
Hace que una variable no pueda ser modificada después de inicializarla.
```java
final int constante = 10;
```

---

## 6. Constructores en Java y Sobrecarga

### Constructor:
Es un método especial que se llama al crear un objeto.
```java
class Coche {
    String marca;
    Coche(String marca) {
        this.marca = marca;
    }
}
```

### Sobrecarga:
Permite definir varios constructores con diferentes parámetros.
```java
class Coche {
    Coche() {
        // Constructor sin parámetros
    }
    
    Coche(String marca) {
        this.marca = marca;
    }
}
```

---

## 7. Herencia en Java y Polimorfismo

### Herencia:
Permite que una clase herede atributos y métodos de otra.
```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

### Polimorfismo:
Es la capacidad de un objeto de adoptar muchas formas.
```java
Animal animal = new Perro();
animal.hacerSonido();  // Salida: El perro ladra
```

---

## 8. Clases Abstractas e Interfaces

### Clases Abstractas:
No pueden ser instanciadas y pueden tener métodos abstractos.
```java
abstract class Figura {
    abstract void dibujar();
}
```

### Interfaces:
Definen métodos que deben ser implementados por una clase.
```java
interface Volador {
    void volar();
}
```

---

## 9. ArrayList en Java

Es una lista dinámica que puede cambiar de tamaño.
```java
import java.util.ArrayList;

ArrayList<String> lista = new ArrayList<>();
lista.add("Elemento 1");
lista.add("Elemento 2");
```

### Métodos Comunes del ArrayList

#### 1. `add()` – Agregar elementos:
```java
lista.add("Ana");
```

#### 2. `remove()` – Eliminar un elemento (por índice o por valor):
```java
lista.remove(1);
lista.remove("Juan");
```

#### 3. `contains()` – Comprobar si un elemento está presente:
```java
boolean existe = lista.contains("María");
```

#### 4. `indexOf()` – Buscar el índice de un elemento:
```java
int indice = lista.indexOf("María");
```

#### 5. `size()` – Devuelve el tamaño del ArrayList:
```java
int tamanio = lista.size();
```

#### 6. `clear()` – Elimina todos los elementos:
```java
lista.clear();
```

---

## 10. Arrays en Java

Un array es una estructura de datos que almacena elementos del mismo tipo y tiene un tamaño fijo.

### Declaración y Creación de Arrays
```java
int[] numeros = new int[5];
int[] numeros2 = {1, 2, 3, 4, 5};
```

### Métodos Útiles de la Clase Arrays

#### 1. `Arrays.toString()` – Para convertir un array en cadena:
```java
import java.util.Arrays;
System.out.println(Arrays.toString(numeros2));
```

#### 2. `Arrays.sort()` – Para ordenar el array:
```java
Arrays.sort(numeros2);
```

#### 3. `Arrays.binarySearch()` – Para buscar un elemento:
```java
int index = Arrays.binarySearch(numeros2, 3);
```

#### 4. `Arrays.fill()` – Para llenar un array con un valor:
```java
Arrays.fill(numeros2, 0);
```

---

## 11. Agregación de Clases en Java

Es una relación en la que una clase contiene referencias a otras clases.
```java
class Motor {
    String tipo;
}

class Coche {
    Motor motor = new Motor();
}
```

---

## 12. Funciones de Cadena en Java

Java proporciona varias funciones para manipular cadenas.
- `length()`
- `substring()`
- `toUpperCase()`
- `toLowerCase()`

```java
String texto = "Hola Mundo";
System.out.println(texto.length());
System.out.println(texto.substring(0, 4));
```

---

## 13. Métodos y Variables Static

### Métodos estáticos:
```java
class Utilidad {
    static void mostrarMensaje() {
        System.out.println("Mensaje estático");
    }
}
```

### Variables estáticas:
```java
class Contador {
    static int contador = 0;
}
```

---

## Conclusión

Este tutorial cubre una amplia gama de temas fundamentales en Java, proporcionando una base sólida para trabajar con el lenguaje. Con estos conocimientos, estarás preparado para abordar problemas y desarrollar aplicaciones robustas utilizando Java.
