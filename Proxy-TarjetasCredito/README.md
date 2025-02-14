# Proxy de Tarjetas de Crédito

Este proyecto implementa el patrón de diseño Proxy para el manejo de pagos con tarjetas de crédito. El patrón Proxy proporciona un sustituto o marcador de posición para controlar el acceso al objeto original, permitiendo realizar operaciones antes o después de que la solicitud llegue al objeto real.

El patrón Proxy actúa como un intermediario que controla el acceso a otro objeto. En este ejemplo, la tarjeta de crédito (Proxy) actúa como intermediario para realizar pagos en efectivo (objeto real), añadiendo validaciones y controles adicionales.

## Estructura del Proyecto

```
src/
├── interfaces/
│   └── Payment.java      # Interfaz que define el comportamiento de pago
├── model/
│   ├── Cash.java        # Implementación de pago en efectivo
│   └── CreditCard.java  # Implementación de pago con tarjeta de crédito
└── Main.java            # Clase principal con ejemplo de implementación
```

## Implementación

El proyecto está estructurado usando los siguientes componentes:

- **Payment**: Interfaz que define el método de pago.
- **Cash**: Clase que implementa el pago en efectivo.
- **CreditCard**: Clase que implementa el pago con tarjeta de crédito.

El patrón Proxy se utiliza para añadir una capa de protección al proceso de pago con tarjeta de crédito, permitiendo validaciones y verificaciones antes de procesar el pago.

### Componentes

#### Payment (Interfaz)
Define el contrato para realizar pagos:
* pay(double amount): Realiza un pago
* getBalance(): Obtiene el saldo disponible

#### Cash (Servicio Real)
Implementa la lógica básica de pagos:
* Mantiene un balance
* Realiza pagos si hay saldo suficiente
* No tiene validaciones adicionales

#### CreditCard (Proxy)
Añade funcionalidad adicional:
* Verifica límites de crédito
* Requiere autorización para montos grandes
* Delega el pago real al objeto Cash

### Cómo funciona
1. El cliente interactúa con la interfaz Payment
2. La tarjeta de crédito (Proxy) recibe la solicitud de pago
3. El Proxy realiza validaciones:
   * Verifica si el monto excede el límite de crédito
   * Comprueba si se necesita autorización especial

* Si las validaciones son exitosas, delega el pago al objeto Cash 
* Cash realiza el pago si hay saldo suficiente

## Cómo Ejecutar

1. Clona el repositorio:
```bash
git clone https://github.com/[tu-usuario]/Proxy-TarjetasCredito.git
```

2. Abre el proyecto en tu IDE favorito

3. Ejecuta la clase `Main.java` para ver el ejemplo de implementación


### Ventajas del patrón Proxy en este ejemplo
* Control de acceso: La tarjeta de crédito controla cómo se realizan los pagos
* Validaciones adicionales: Permite añadir reglas sin modificar la clase Cash
* Separación de responsabilidades: Cada clase tiene un propósito específico
* Flexibilidad: Fácil de añadir nuevas validaciones o tipos de pago
