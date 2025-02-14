package artdeco;

import interfaces.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    public void putOn() {
        System.out.println("Poniendo objeto en mesa de café Art Decó");

    }

    public String getShape() {
        return "Elegante y lacada";

    }
}
