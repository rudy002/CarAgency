package AbstractFactoryDP;

import RegularClasses.Frigate;
import abstractClass.*;
import RegularClasses.CruiseShip;

import javax.swing.*;
import java.util.ArrayList;

public class MarineFactory implements IVehicleFactory {

    @Override
    public Vehicle ProduceVehicle(String vehicleType, ArrayList<Object> parameters) {
        return switch (vehicleType) {
            case "CruiseShip" ->
                    new CruiseShip((String) parameters.get(0), (Integer) parameters.get(1), (Double) parameters.get(2), (String) parameters.get(3), (String) parameters.get(4));
            case "Frigate" ->
                    new Frigate((String) parameters.get(0), (Integer) parameters.get(1), (Double) parameters.get(2), (String) parameters.get(3));
            default -> {
                JOptionPane.showMessageDialog(null, "Invalid vehicle type", "Error", JOptionPane.ERROR_MESSAGE);
                yield null;
            }
        };
    }
}
