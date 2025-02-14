package interpreter.expresiones;

import interpreter.modelo.Coche;

// Expresión no terminal para combinar dos expresiones con OR
public class Or implements ExpresionBusqueda {
    private ExpresionBusqueda exp1;
    private ExpresionBusqueda exp2;

    public Or(ExpresionBusqueda exp1, ExpresionBusqueda exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpretar(Coche coche) {
        return exp1.interpretar(coche) || exp2.interpretar(coche);
    }
}