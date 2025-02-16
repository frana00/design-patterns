package SumaMultiplicacion;

class Suma implements ExpresionAbstracta {
    private ExpresionAbstracta izquierda;
    private ExpresionAbstracta derecha;

    public Suma(ExpresionAbstracta izquierda, ExpresionAbstracta derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        return this.izquierda.interpretar() + this.derecha.interpretar();
    }
}
