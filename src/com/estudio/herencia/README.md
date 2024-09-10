
# Tutorial Interactivo: Clases, Métodos y Atributos en Java

## Introducción

¡Bienvenido al tutorial sobre **Clases, Métodos y Atributos** en Java! A lo largo de este taller, aprenderás a utilizar estos conceptos fundamentales de la **Programación Orientada a Objetos (POO)** para crear programas eficientes. Este tutorial está diseñado paso a paso, permitiéndote entender cada concepto y aplicarlo de manera interactiva. ¡Empecemos!

---

## Paso 1: **Clases en Java**
### Objetivo:
Entender qué es una clase y cómo se utiliza para modelar objetos del mundo real.

### Conceptos clave:
- **Clase**: Es una plantilla o molde a partir de la cual se crean objetos. Define los atributos (características) y los métodos (comportamientos).
- **Objeto**: Una instancia de una clase.

### Ejemplo:
```java
class Persona {
    String nombre;
    int edad;
}
```
Aquí hemos creado una clase `Persona` que tiene dos atributos: `nombre` y `edad`.

### Pregunta interactiva:
1. ¿Cuál es el propósito de una clase en Java?
    - A) Ejecutar el programa principal
    - B) Definir una plantilla para crear objetos
    - C) Manipular datos

   **Respuesta correcta**: B

### Tarea 1:
- Crea una clase llamada `Coche` con los atributos `marca` y `modelo`. Luego, define dos objetos de tipo `Coche`.

```java
class Coche {
    String marca;
    String modelo;
}

Coche coche1 = new Coche();
Coche coche2 = new Coche();
```

### Reflexión:
Piensa en cualquier objeto del mundo real (por ejemplo, una computadora). ¿Cómo lo representarías como una clase? ¿Qué atributos y comportamientos tendría?

---

## Paso 2: **Atributos en Java**
### Objetivo:
Entender qué son los atributos de una clase y cómo se utilizan para representar las características de un objeto.

### Conceptos clave:
- **Atributos**: Son variables dentro de una clase que definen las propiedades del objeto.
- Pueden ser de diferentes tipos: `int`, `String`, `double`, etc.

### Ejemplo:
```java
class Coche {
    String marca;
    String modelo;
    int anio;
}
```
En este ejemplo, `marca`, `modelo` y `anio` son atributos de la clase `Coche`.

### Ejercicio interactivo:
- Modifica la clase `Persona` que creaste antes y agrega un atributo `altura`.

```java
class Persona {
    String nombre;
    int edad;
    double altura;  // Nuevo atributo
}
```

### Pregunta interactiva:
2. ¿Qué tipo de dato usarías para el atributo `altura` si se mide en metros?
    - A) `int`
    - B) `double`
    - C) `String`

   **Respuesta correcta**: B

### Tarea 2:
- Crea una clase `Libro` con los atributos `titulo`, `autor` y `numPaginas`. Luego, define un objeto `miLibro` y asigna valores a estos atributos.

```java
class Libro {
    String titulo;
    String autor;
    int numPaginas;
}

Libro miLibro = new Libro();
miLibro.titulo = "1984";
miLibro.autor = "George Orwell";
miLibro.numPaginas = 328;
```

---

## Paso 3: **Métodos en Java**
### Objetivo:
Aprender qué son los métodos en Java y cómo se utilizan para definir los comportamientos de los objetos.

### Conceptos clave:
- **Método**: Es una función definida dentro de una clase que especifica un comportamiento.
- Los métodos pueden devolver un valor o ser de tipo `void` si no retornan nada.

### Ejemplo:
```java
class Coche {
    String marca;
    String modelo;

    void arrancar() {
        System.out.println("El coche ha arrancado.");
    }
}
```
El método `arrancar()` imprime un mensaje que indica que el coche ha comenzado a funcionar.

### Pregunta interactiva:
3. ¿Cuál es el propósito de un método en una clase?
    - A) Definir comportamientos para los objetos
    - B) Almacenar datos
    - C) Ejecutar el programa principal

   **Respuesta correcta**: A

### Tarea 3:
- Añade un método llamado `mostrarDetalles` en la clase `Coche` que imprima la marca y el modelo del coche.

```java
class Coche {
    String marca;
    String modelo;

    void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
```

---

## Paso 4: **Creación de Objetos e Interacción con Métodos**
### Objetivo:
Aprender a crear objetos a partir de clases y utilizar métodos para interactuar con ellos.

### Conceptos clave:
- **Objeto**: Se crea a partir de una clase, por ejemplo: `Coche miCoche = new Coche();`.
- Asignar valores a los atributos del objeto.
- Llamar a métodos del objeto.

### Ejemplo:
```java
Coche miCoche = new Coche();
miCoche.marca = "Toyota";
miCoche.modelo = "Corolla";
miCoche.arrancar();
```

### Ejercicio interactivo:
- Crea un objeto de la clase `Persona` y asigna valores a sus atributos. Luego, añade un método que imprima la edad de la persona.

```java
class Persona {
    String nombre;
    int edad;

    void mostrarEdad() {
        System.out.println("Edad: " + edad);
    }
}
```

### Pregunta interactiva:
4. ¿Cómo se llama a un método en Java?
    - A) Definiendo una nueva clase
    - B) Asignando un valor a un atributo
    - C) Usando el nombre del objeto seguido del nombre del método

   **Respuesta correcta**: C

---

## Paso 5: **Constructores en Java**
### Objetivo:
Entender el uso de constructores para inicializar objetos.

### Conceptos clave:
- **Constructor**: Es un método especial que se llama cuando se crea un objeto. Se utiliza para inicializar los atributos del objeto.

### Ejemplo:
```java
class Coche {
    String marca;
    String modelo;

    // Constructor
    Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
```
En este ejemplo, el constructor inicializa los atributos `marca` y `modelo`.

### Pregunta interactiva:
5. ¿Cuál es el propósito de un constructor en Java?
    - A) Destruir objetos
    - B) Inicializar atributos al crear un objeto
    - C) Ejecutar el programa principal

   **Respuesta correcta**: B

### Tarea 5:
- Crea un constructor para la clase `Persona` que inicialice los atributos `nombre`, `edad` y `altura`.

```java
class Persona {
    String nombre;
    int edad;
    double altura;

    // Constructor
    Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
}
```

---

## Paso 6: **Sobrecarga de Métodos**
### Objetivo:
Comprender la sobrecarga de métodos, es decir, la capacidad de definir más de un método con el mismo nombre pero diferentes parámetros.

### Conceptos clave:
- **Sobrecarga de métodos**: Permite definir varios métodos con el mismo nombre, pero con diferentes listas de parámetros.

### Ejemplo:
```java
class Coche {
    String marca;
    String modelo;

    void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    // Sobrecarga del método mostrarDetalles
    void mostrarDetalles(String color) {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
    }
}
```

---

## Conclusión

¡Felicidades! Ahora tienes una comprensión sólida de **Clases, Atributos, Métodos, Constructores y Sobrecarga** en Java. Este conocimiento es esencial para la **Programación Orientada a Objetos**, y con práctica, te sentirás cada vez más cómodo aplicando estos conceptos en tus propios proyectos.

