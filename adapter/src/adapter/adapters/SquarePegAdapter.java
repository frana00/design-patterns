package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calcula el radio mínimo del círculo que puede contener la clavija cuadrada
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
