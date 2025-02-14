package cafe;

public class Main {
    public static void main(String[] args) {
        // 1. Café simple
        Cafe cafe1 = new CafeSimple();
        System.out.println("1. " + cafe1.getDescripcion() +
                " ($" + cafe1.getCosto() + ")");

        // 2. Café con leche
        Cafe cafe2 = new LecheDecorator(new CafeSimple());
        System.out.println("2. " + cafe2.getDescripcion() +
                " ($" + cafe2.getCosto() + ")");

        // 3. Café con leche y azúcar
        Cafe cafe3 = new AzucarDecorator(
                new LecheDecorator(
                        new CafeSimple()));
        System.out.println("3. " + cafe3.getDescripcion() +
                " ($" + cafe3.getCosto() + ")");
    }
}