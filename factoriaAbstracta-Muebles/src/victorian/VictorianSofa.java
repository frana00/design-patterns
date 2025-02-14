package victorian;

import interfaces.Sofa;

public class VictorianSofa implements Sofa {
    public void lieOn() {
        System.out.println("Acostado en sofá victoriano");
    }

    public int getNumberOfSeats() {
        return 3;
    }
}
