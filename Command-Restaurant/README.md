# Patrón Command - Restaurante 🍽️

## 📝 Descripción
Este proyecto implementa el **Patrón de Diseño Command** utilizando un ejemplo sencillo de un restaurante. El patrón Command encapsula una solicitud como un objeto, permitiendo desacoplar el objeto que invoca la operación (el camarero) del que realiza la operación (el chef o la mesa). Esto facilita la flexibilidad, extensibilidad y organización del código.

### 🎯 Analogía
En un restaurante:
- **Cliente**: Tú, que haces un pedido.
- **Camarero**: Toma tu pedido y lo pasa al chef o al encargado de preparar la mesa.
- **Pedido (Comando)**: Una orden que encapsula toda la información necesaria para realizar una acción.
- **Chef/Mesa (Receptores)**: Los que realmente ejecutan las acciones (preparar comida o preparar la mesa).

El camarero no necesita saber cómo se prepara la comida o cómo se organiza la mesa. Solo toma las órdenes y las pasa a los responsables adecuados.

## Estructura del Proyecto

```
src/
├── commands/
│   ├── Command.java          # Interfaz Command
│   ├── OrderFoodCommand.java # Comando concreto para órdenes de comida
│   └── PrepareTableCommand.java
├── restaurant/
│   ├── Chef.java            # Receptor para órdenes de comida
│   └── Table.java           # Receptor para operaciones de mesa
├── staff/
│   └── Waiter.java          # Invocador que gestiona los comandos
└── Main.java                # Implementación de demostración
```

## Implementación del Patrón de Diseño

Este proyecto implementa el Patrón Command con los siguientes componentes:

- **Interfaz Command**: Define el contrato para todos los comandos con un método `execute()`
- **Comandos Concretos**: 
  - `OrderFoodCommand`: Encapsula una solicitud para preparar platos específicos
  - `PrepareTableCommand`: Encapsula operaciones de preparación de mesa
- **Invocador**: La clase `Waiter` (Camarero) que toma y ejecuta órdenes sin conocer los detalles específicos de cada comando
- **Receptores**: 
  - `Chef`: Maneja las solicitudes de preparación de comida
  - `Table`: Maneja las operaciones de preparación de mesa

## Ejemplo de Uso

```java
// Crear receptores
Chef chef = new Chef();
Table table = new Table(1);

// Crear comandos
Command prepareTable = new PrepareTableCommand(table);
Command orderPasta = new OrderFoodCommand(chef, "Pasta Carbonara");

// Crear invocador
Waiter waiter = new Waiter();

// Tomar órdenes
waiter.takeOrder(prepareTable);
waiter.takeOrder(orderPasta);

// Ejecutar todas las órdenes
waiter.executeOrders();
```

## 🔄 Flujo del Patrón Command
1. El cliente llega al restaurante y hace un pedido.
2. El camarero toma las órdenes (comandos).
3. Las órdenes son ejecutadas por los receptores (chef o mesa).
4. El camarero actúa como invocador, sin necesidad de conocer los detalles de cómo se ejecuta cada orden.

## 💡 Ventajas del Patrón
- **Desacoplamiento**: Separa el objeto que invoca la operación del que sabe cómo ejecutarla.
- **Extensibilidad**: Fácil de añadir nuevos comandos sin modificar el código existente.
- **Flexibilidad**: Los comandos pueden ser manipulados y extendidos como cualquier otro objeto.
- **Organización**: Cada clase tiene una única responsabilidad bien definida.

## 🎯 Casos de Uso Comunes
- Sistemas de pedidos en restaurantes.
- Interfaces gráficas (botones, menús, atajos de teclado).
- Sistemas de transacciones (deshacer/rehacer).
- Colas de tareas o macros.

## 📚 Consideraciones
- Mantén los comandos simples y enfocados en una única acción.
- Considera implementar funcionalidades adicionales como deshacer/rehacer si es necesario.
- Evalúa si necesitas persistencia de comandos para escenarios más complejos.

