package RegularClasses;
//import packages
import abstractClass.AirVehicle;
import abstractClass.INotEngine;

public class SpyPlane extends AirVehicle implements INotEngine {

    //data members
    private String sourceOfEnergy; // source of energy of the vehicle.

    //constructor
    public SpyPlane(String sourceOfEnergy) {
        super("classified", 0, 1, 50, AirVehicleType.military);
        setSourceOfEnergy(sourceOfEnergy);
        scoreEnergy(scoreEnergy.C);
    }

    @Override
    public boolean setSourceOfEnergy(String source) {
        try {
            this.sourceOfEnergy = source;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean scoreEnergy(scoreEnergy score) {
        if(score == scoreEnergy.A || score == scoreEnergy.B || score == scoreEnergy.C) {
            return true;
        }
        else {
            return false;
        }
    }
}
