package victorian;

import interfaces.*;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public CoffeeTable createCoffeeTable(){
        return new VictorianCoffeeTable();
    }
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}


