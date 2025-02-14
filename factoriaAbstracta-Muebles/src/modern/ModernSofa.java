package modern;

import interfaces.Sofa;

public class ModernSofa implements Sofa {
    public void lieOn() {
        System.out.println("Acostado en sofá moderno minimalista");
    }

    public int getNumberOfSeats() {
        return 3;
    }
}
