# 🏪 Patrón Decorator: Ejemplo de Cafetería

### 🤔 ¿Qué es el patrón Decorator?
Imagina que tienes una cafetería. Empiezas vendiendo café simple, pero tus clientes quieren personalizarlo con extras:
- Leche
- Azúcar
- Canela
- etc...

### ❌ Sin el patrón Decorator (la forma difícil):
Tendrías que crear una clase para CADA combinación posible:
```java
class CafeSimple { }
class CafeConLeche { }
class CafeConAzucar { }
class CafeConLecheYAzucar { }
class CafeConLecheAzucarYCanela { }
// ... ¡un montón más de combinaciones! 😱
```

### ✅ Con el patrón Decorator (la forma inteligente):

Es como vestirse por la mañana:
- Empiezas con tu cuerpo (café base)
- Te pones una camiseta (+ leche)
- Te pones un suéter (+ azúcar)
- Te pones una chaqueta (+ canela)

### 📁 Estructura del proyecto
```
src/
└── cafe/
├── Cafe.java // Interfaz base
├── CafeSimple.java // Café básico
├── ExtraDecorator.java // Decorador base
├── LecheDecorator.java // Decorador de leche
├── AzucarDecorator.java// Decorador de azúcar
└── Main.java // Programa principal
```
### 💡 Cómo funciona:

Cada archivo tiene un propósito específico:

1. **Cafe.java**: Define el contrato base
    - Método getCosto()
    - Método getDescripcion()

2. **CafeSimple.java**: Implementa el café básico
