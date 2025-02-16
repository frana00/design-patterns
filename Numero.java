package Interprete.SumaMultiplicacion;

//// Clase para representar un número (expresión terminal)
public class Numero implements ExpresionAbstracta{
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int interpretar() {
        return this.valor;
    }
}
