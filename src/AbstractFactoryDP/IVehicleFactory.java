package AbstractFactoryDP;

import abstractClass.Ivehicle;
import abstractClass.Vehicle;

import java.util.ArrayList;


public interface IVehicleFactory {
    public Vehicle ProduceVehicle(String vehicleType, ArrayList<Object> parameters);
}
