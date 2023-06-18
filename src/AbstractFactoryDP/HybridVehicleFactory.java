package AbstractFactoryDP;

import abstractClass.Ivehicle;
import RegularClasses.Amphibious;
import RegularClasses.HybridPlane;
import abstractClass.Vehicle;


import javax.swing.*;
import java.util.ArrayList;

public abstract class HybridVehicleFactory implements IVehicleFactory{


    @Override
    public Vehicle ProduceVehicle(String vehicleType, ArrayList<Object> parameters) {
        return switch (vehicleType) {
            case "Amphibious" ->
                    new Amphibious((String) parameters.get(0), (Double) parameters.get(1), (Integer) parameters.get(2), (Double) parameters.get(3), (Double) parameters.get(4), (Integer) parameters.get(5), (String) parameters.get(5));
            case "HybridPlane" ->
                    new HybridPlane((String) parameters.get(0), (Double) parameters.get(1), (Integer) parameters.get(2), (Double) parameters.get(3), (Double) parameters.get(4), (Integer) parameters.get(5), (String) parameters.get(5));
            default -> {
                JOptionPane.showMessageDialog(null, "Invalid vehicle type", "Error", JOptionPane.ERROR_MESSAGE);
                yield null;
            }
        };
    }
}
