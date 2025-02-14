package cafe;

public class CafeSimple implements Cafe {
    @Override
    public double getCosto() {
        return 1.0;
    }

    @Override
    public String getDescripcion() {
        return "Café simple";
    }
}