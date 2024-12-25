package builders.builders;

import builders.cars.CarType;
import builders.components.Engine;
import builders.components.GPSNavigator;
import builders.components.Transmission;
import builders.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}