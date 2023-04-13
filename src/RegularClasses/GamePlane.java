package RegularClasses;

//import packages
import abstractClass.INotEngine;
import abstractClass.AirVehicle;

public class GamePlane extends AirVehicle implements INotEngine {

    //data members
    private String sourceOfEnergy; // source of energy of the vehicle.

    //constructor
    public GamePlane() {
        super("Toy", 0, 0, 10, AirVehicleType.civilian);
        setSourceOfEnergy("Manual");
        scoreEnergy(scoreEnergy.A);
    }

    @Override //override the method from the interface
    public boolean setSourceOfEnergy(String source) {
        try {
            this.sourceOfEnergy = source;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override //override the method from the interface
    public Boolean scoreEnergy(scoreEnergy score) {
        if(score == scoreEnergy.A || score == scoreEnergy.B || score == scoreEnergy.C) {
            return true;
        }
        else {
            return false;
        }
    }
}
