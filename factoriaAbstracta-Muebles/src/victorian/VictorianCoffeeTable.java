package victorian;

import interfaces.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    public void putOn() {
        System.out.println("Poniendo objeto en mesa de café victoriana");

    }

    public String getShape() {
        return "Ovalada con borde tallado";

    }
}
