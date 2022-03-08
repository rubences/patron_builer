package patron_builer.builders;

import patron_builer.cars.CarType;
import patron_builer.components.Engine;
import patron_builer.components.GPSNavigator;
import patron_builer.components.Transmission;
import patron_builer.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}