package AbstractFactoryDP;

import abstractClass.*;
import RegularClasses.GamePlane;
import RegularClasses.SpyPlane;

import javax.swing.*;
import java.util.ArrayList;

public class AirFactory implements IVehicleFactory{
    @Override
    public Vehicle ProduceVehicle(String vehicleType, ArrayList<Object> parameters) {
        return switch (vehicleType) {
            case "GamePlane" -> new GamePlane((String) parameters.get(0));
            case "SpyPlane" -> new SpyPlane((String) parameters.get(0), (String) parameters.get(1));
            default -> {
                JOptionPane.showMessageDialog(null, "Invalid vehicle type", "Error", JOptionPane.ERROR_MESSAGE);
                yield null;
            }
        };
    }
}
