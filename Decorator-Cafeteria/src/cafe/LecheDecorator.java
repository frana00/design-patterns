package cafe;

public class LecheDecorator extends ExtraDecorator {
    public LecheDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.5;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + leche";
    }
}