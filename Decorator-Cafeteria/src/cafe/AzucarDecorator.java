package cafe;

public class AzucarDecorator extends ExtraDecorator {
    public AzucarDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.2;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + azúcar";
    }
}