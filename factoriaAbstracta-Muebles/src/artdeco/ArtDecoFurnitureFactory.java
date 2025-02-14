package artdeco;

import interfaces.*;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new ArtDecoChair();
    }

    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
