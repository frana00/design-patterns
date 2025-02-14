package modern;

import interfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    public void putOn() {
        System.out.println("Poniendo objeto en mesa de café moderna");

    }

    public String getShape() {
        return "Cuadrada minimalista";

    }
}
