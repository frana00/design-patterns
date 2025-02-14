# Patrón Command - Control Remoto Universal 🎮

## 📝 Descripción

Este proyecto demuestra una implementación simple del patrón de diseño Command utilizando el ejemplo de un control remoto universal. El patrón Command encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes, encolar o registrar solicitudes y soportar operaciones que pueden deshacerse.

### 🎯 Analogía
Imagina un control remoto universal:

* No necesitas saber cómo funciona cada dispositivo internamente
* Puedes añadir nuevos dispositivos fácilmente
* Cada botón encapsula una acción específica
* Puedes reconfigurar los botones según necesites

🏗️ Estructura del Proyecto
```
src/
├── commands/
│   ├── Command.java          # Interfaz base para todos los comandos
│   ├── LightOnCommand.java   # Comando para encender la luz
│   └── LightOffCommand.java  # Comando para apagar la luz
├── devices/
│   └── Light.java           # Dispositivo que ejecuta las acciones reales
├── remote/
│   └── RemoteControl.java   # Invocador que maneja los comandos
└── Main.java                # Clase principal con ejemplo de uso
```
🔍 Componentes Principales

1. Command Interface
```java
public interface Command {
    void execute();
}
```
Define el contrato para todos los comandos.

2. Concrete Commands: Implementan la interfaz Command para acciones específicas:

* LightOnCommand: Enciende la luz
* LightOffCommand: Apaga la luz

3. Receiver (Light): El dispositivo que realiza las acciones reales:

* turnOn(): Enciende la luz
* turnOff(): Apaga la luz

4. Invoker (RemoteControl): Maneja los comandos y los ejecuta cuando es necesario.

## 🚀 Cómo Ejecutar

* Clona el repositorio
* Compila el proyecto
* Ejecuta el archivo Main.java

## 🔄 Flujo del Patrón Command

* El cliente crea los receptores (dispositivos)
* El cliente crea y configura los comandos con los receptores
* El cliente configura el invocador (control remoto) con los comandos
* El invocador ejecuta los comandos cuando es necesario
### 💡 Ventajas del Patrón
* Desacoplamiento: Separa el objeto que invoca la operación del que sabe cómo ejecutarla
* Extensibilidad: Fácil de añadir nuevos comandos sin modificar el código existente
* Composición: Permite crear comandos complejos combinando comandos simples
* Flexibilidad: Los comandos pueden ser manipulados y extendidos como cualquier otro objeto
### 🎯 Casos de Uso Comunes
* Interfaces gráficas (GUI)
* Transacciones en bases de datos
* Operaciones de deshacer/rehacer
* Colas de tareas
* Macros
### 📚 Consideraciones
* Mantener los comandos simples y con una única responsabilidad
* Considerar la implementación de deshacer/rehacer si es necesario
* Evaluar si se necesita persistencia de comandos
* Gestionar adecuadamente los recursos en comandos complejos