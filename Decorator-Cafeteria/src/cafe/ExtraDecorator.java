package cafe;

public abstract class ExtraDecorator implements Cafe {
    protected Cafe cafe;

    public ExtraDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}