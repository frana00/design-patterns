package SumaMultiplicacion;

public class Main {
    public static void main(String[] args) {
        // Crear las expresiones
        ExpresionAbstracta numero1 = new Numero(2);
        ExpresionAbstracta numero2 = new Numero(3);
        ExpresionAbstracta numero3 = new Numero(4);

        // Crear una suma de 2 + 3
        ExpresionAbstracta suma = new Suma(numero1, numero2);

        // Crear una multiplicación del resultado de (2 + 3) * 4
        ExpresionAbstracta multiplicacion = new Multiplicacion(suma, numero3);

        // Interpretar y mostrar el resultado final
        int resultado = multiplicacion.interpretar();
        System.out.println("El resultado de (2 + 3) * 4 es: " + resultado);
    }
}
