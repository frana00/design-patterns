# Patrón Observer - Ejemplo con YouTube
## Descripción
Este proyecto demuestra una implementación simple del patrón de diseño Observer utilizando un ejemplo de un canal de YouTube y sus suscriptores. El patrón Observer establece una relación uno-a-muchos entre objetos, permitiendo que múltiples objetos sean notificados automáticamente cuando ocurre un cambio en otro objeto.

### 🎯 Analogía con YouTube

* Canal de YouTube = Sujeto (Subject)
* Suscriptores = Observadores (Observers)
* Subir un video = Cambio de estado
* Notificaciones = Actualizaciones a los observadores

### 🏗️ Estructura del Proyecto

```
src/
├── interfaces/
│   ├── Observer.java      # Interfaz para los observadores
│   └── Subject.java       # Interfaz para el sujeto observado
├── models/
│   ├── YouTubeChannel.java # Implementación del canal
│   └── Subscriber.java     # Implementación del suscriptor
└── Main.java              # Clase principal con ejemplo de uso
```
🔍 Componentes Principales

##### 1. Interfaces
*    Observer.java: Define el método de actualización que los observadores deben implementar.
*    Subject.java: Define los métodos para agregar, eliminar y notificar observadores.
##### 2. Implementaciones
*    YouTubeChannel.java: Implementa el sujeto observado (canal de YouTube).
*    Subscriber.java: Implementa los observadores (suscriptores).

### 🚀 Ejecución
* Clona el repositorio
* Compila el proyecto
* Ejecuta la clase Main

```
javac src/**/*.java
java src/Main
```

## 🔄 Flujo del Patrón Observer

* El sujeto (YouTubeChannel) mantiene una lista de observadores (Subscribers)
* Los observadores pueden suscribirse o desuscribirse en cualquier momento
* Cuando ocurre un cambio (nuevo video), el sujeto notifica a todos sus observadores
* Cada observador recibe y procesa la notificación

### 💡 Ventajas del Patrón

* Desacoplamiento: El sujeto no necesita conocer los detalles de sus observadores
* Extensibilidad: Se pueden añadir nuevos tipos de observadores sin modificar el sujeto
* Broadcast: Permite notificar a múltiples objetos simultáneamente
* Flexibilidad: Los observadores pueden suscribirse o desuscribirse dinámicamente

### 🎯 Casos de Uso Comunes

* Sistemas de eventos en interfaces gráficas
* Notificaciones push en aplicaciones
* Actualizaciones en tiempo real
* Manejo de eventos en arquitecturas distribuidas
* Sistemas de monitoreo