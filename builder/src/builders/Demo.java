package builders;

import builders.builders.CarBuilder;
import builders.builders.CarManualBuilder;
import builders.cars.Car;
import builders.cars.Manual;
import builders.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Construir un coche
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        // Construir el manual del coche
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}