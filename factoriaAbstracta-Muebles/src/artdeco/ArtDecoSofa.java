package artdeco;

import interfaces.Sofa;

public class ArtDecoSofa implements Sofa{
    public void lieOn() {
        System.out.println("Acostado en sofá Art Deco");
    }

    public int getNumberOfSeats() {
        return 3;
    }
}
