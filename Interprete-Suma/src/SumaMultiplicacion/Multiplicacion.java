package SumaMultiplicacion;

// Clase para representar una multiplicación (expresión no terminal)
class Multiplicacion implements ExpresionAbstracta {
    private ExpresionAbstracta izquierda;
    private ExpresionAbstracta derecha;

    public Multiplicacion(ExpresionAbstracta izquierda, ExpresionAbstracta derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        return this.izquierda.interpretar() * this.derecha.interpretar();
    }
}
