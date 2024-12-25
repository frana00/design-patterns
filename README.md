# Patrones de Diseño en Java - UNIR

Este repositorio contiene implementaciones en Java de algunos patrones de diseño, basados en los ejemplos proporcionados por [Refactoring.guru](https://refactoring.guru/es/design-patterns/java). El proyecto fue desarrollado como parte de la asignatura de Reutilización de Software del Máster en Ingeniería de Software y Sistemas Informáticos de la Universidad Internacional de La Rioja (UNIR).

## Patrones Implementados

El repositorio incluye los siguientes patrones de diseño:

- **Builder**: Patrón creacional que permite construir objetos complejos paso a paso.
  - Ejemplo: Construcción de diferentes tipos de automóviles
  - [Ver ejemplo original](https://refactoring.guru/es/design-patterns/builder/java/example)

- **Adapter**: Patrón estructural que permite la colaboración entre objetos con interfaces incompatibles.
  - Ejemplo: Adaptador de clavijas cuadradas a agujeros redondos
  - [Ver ejemplo original](https://refactoring.guru/es/design-patterns/adapter/java/example)

- **Decorator**: Patrón estructural que permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos contenedor especiales.
  - Ejemplo: Cifrado y compresión de datos
  - [Ver ejemplo original](https://refactoring.guru/es/design-patterns/decorator/java/example)

- **Proxy**: Patrón estructural que proporciona un sustituto o marcador de posición para otro objeto.
  - Ejemplo: Caché para biblioteca de YouTube
  - [Ver ejemplo original](https://refactoring.guru/es/design-patterns/proxy/java/example)

## Estructura del Proyecto

El proyecto está organizado en paquetes separados para cada patrón de diseño:

```
src/
├── builder/     # Implementación del patrón Builder
├── adapter/     # Implementación del patrón Adapter
├── decorator/   # Implementación del patrón Decorator
└── proxy/       # Implementación del patrón Proxy
```

## Requisitos

- Java JDK 11 o superior
- IDE: IntelliJ IDEA (recomendado)

## Cómo ejecutar los ejemplos

Cada patrón tiene su propia clase `Demo` que contiene el método `main()`. Para ejecutar un ejemplo:

1. Abrir el proyecto en IntelliJ IDEA
2. Navegar hasta la clase `Demo` del patrón deseado
3. Ejecutar el método `main()`

## Referencias

- [Refactoring.guru - Patrones de Diseño](https://refactoring.guru/es/design-patterns)
- Universidad Internacional de La Rioja (UNIR) - Asignatura: Reutilización de Software
