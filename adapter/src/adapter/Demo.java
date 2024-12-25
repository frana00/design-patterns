package adapter;

import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;
import adapter.adapters.SquarePegAdapter;

public class Demo {
    public static void main(String[] args) {
        // Agujero redondo de radio 5
        RoundHole hole = new RoundHole(5);
        // Clavija redonda de radio 5
        RoundPeg rpeg = new RoundPeg(5);

        // La clavija redonda cabe en el agujero redondo
        if (hole.fits(rpeg)) {
            System.out.println("La clavija redonda r5 cabe en el agujero redondo r5.");
        }

        // Clavijas cuadradas pequeña y grande
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(10);

        // Adaptador para las clavijas cuadradas
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        // La clavija cuadrada pequeña cabe en el agujero redondo
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("La clavija cuadrada w2 cabe en el agujero redondo r5.");
        }

        // La clavija cuadrada grande no cabe en el agujero redondo
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada w10 no cabe en el agujero redondo r5.");
        }
    }
}