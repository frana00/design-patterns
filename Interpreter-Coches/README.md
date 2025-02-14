# Patrón Interpreter (Intérprete)

## Descripción

El patrón Interpreter permite definir una representación de la gramática de un lenguaje y un intérprete que utilice esta representación para interpretar sentencias del lenguaje. Es útil cuando necesitas crear tu propio "mini-lenguaje" para resolver un problema específico.

## Estructura

```
src/
├── interpreter/
│   ├── expresiones/
│   │   ├── ExpresionBusqueda.java    // Interfaz base
│   │   ├── BuscarMarca.java          // Expresión terminal
│   │   ├── BuscarPrecio.java         // Expresión terminal
│   │   ├── And.java                  // Expresión no terminal
│   │   └── Or.java                   // Expresión no terminal
│   ├── modelo/
│   │   └── Coche.java                // Clase del modelo
│   └── Main.java                     // Clase principal
```
### Componentes Principales
1. Expresión Abstracta (ExpresionBusqueda)
   Define la interfaz común para todas las expresiones
   Declara el método interpretar()
2. Expresiones Terminales (BuscarMarca, BuscarPrecio)
   Implementan operaciones básicas
   Representan los símbolos terminales de la gramática
3. Expresiones No Terminales (And, Or)
   Mantienen otras expresiones como hijos
   Implementan operaciones para expresiones compuestas
4. Contexto (Coche)
   Contiene la información que el intérprete necesita

Ejemplo de Uso
```java
// Crear una expresión de búsqueda
ExpresionBusqueda busqueda = new And(
    new BuscarMarca("Toyota"),
    new BuscarPrecio(30000)
);

// Interpretar la expresión
if (busqueda.interpretar(coche)) {
    System.out.println("El coche cumple los criterios");
}
```

#### Ventajas

* Facilita la creación de lenguajes específicos
* Permite definir reglas de forma flexible
* Fácil de implementar y extender

#### Desventajas

* Se necesita una clase por cada regla gramatical
* Puede ser difícil de mantener si hay muchas reglas
* La gramática compleja puede llevar a una jerarquía de clases compleja

#### Patrones Relacionados

Composite: Para construir el árbol sintáctico
Flyweight: Para compartir símbolos terminales
Iterator: Para recorrer la estructura
Visitor: Para mantener el comportamiento de los nodos

#### Casos de Uso

* Parsers SQL
* Procesadores de expresiones matemáticas
* Motores de búsqueda personalizados
* Intérpretes de comandos simples

## Cómo Ejecutar el Ejemplo

Clona el repositorio
Compila los archivos Java:
```
javac interpreter/Main.java
```
Ejecuta el programa:
```
java interpreter.Main
```
