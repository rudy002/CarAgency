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

    public String getSourceOfEnergy() {
        return sourceOfEnergy;
    }

    @Override //override the method from the interface
    public Boolean scoreEnergy(scoreEnergy score) {
        if(score == scoreEnergy.A) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof GamePlane))
        {
            return false;
        }
        GamePlane v = (GamePlane) obj;
        return super.equals(obj) && v.sourceOfEnergy.equals(this.sourceOfEnergy);
    }

    @Override
    public String toString() {
        return "GamePlane :  : " + super.toString() + ", source of energy : " + getSourceOfEnergy() + ", score energy : A";
    }
}
