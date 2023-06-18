package AbstractFactoryDP;

import RegularClasses.*;
import abstractClass.*;

import javax.swing.*;
import java.util.ArrayList;

public  class LandFactory implements IVehicleFactory{
    @Override
    public Vehicle ProduceVehicle(String vehicleType, ArrayList<Object> parameters) {
        return switch (vehicleType) {
            case "Jeep" ->
                    new Jeep((String) parameters.get(0), (Double) parameters.get(1), (Double) parameters.get(2), (Double) parameters.get(3), (String) parameters.get(4));
            case "Bicycle" ->
                    new Bicycle((String) parameters.get(0), (LandVehicle.kindOfLand) parameters.get(1), (String) parameters.get(2));
            case "ElectricBicycle" ->
                    new ElectricBicycle((String) parameters.get(0), (Double) parameters.get(1), (Double) parameters.get(2), (String) parameters.get(3));
            default -> {JOptionPane.showMessageDialog(null, "Invalid vehicle type", "Error", JOptionPane.ERROR_MESSAGE);
                    yield null;
            }
        };
    }
}
