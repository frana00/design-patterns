import interfaces.*;
import interfaces.CoffeeTable;
import interfaces.FurnitureFactory;
import modern.*;
import victorian.*;
import artdeco.*;

public class Demo {
    private static void clientCode(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.lieOn();
        System.out.println("Mesa de café forma: " + coffeeTable.getShape());
    }

    public static void main(String[] args) {
        System.out.println("Cliente: Probando mobiliario moderno");
        clientCode(new ModernFurnitureFactory());

        System.out.println("\nCliente: Probando mobiliario victoriano");
        clientCode(new VictorianFurnitureFactory());

        System.out.println("\nCliente: Probando mobiliario Art Decó");
        clientCode(new ArtDecoFurnitureFactory());
    }

}