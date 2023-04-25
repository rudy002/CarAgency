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
        this.sourceOfEnergy = sourceOfEnergy;
        //setSourceOfEnergy(sourceOfEnergy);
        scoreEnergy(scoreEnergy.C);
    }

    //getters and setters

    @Override
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

    @Override
    public Boolean scoreEnergy(scoreEnergy score) {
        if(score == scoreEnergy.C) {
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
        if(!(obj instanceof SpyPlane))
        {
            return false;
        }
        SpyPlane v = (SpyPlane) obj;
        return super.equals(obj) && v.sourceOfEnergy == this.sourceOfEnergy;
    }

    @Override
    public String toString() {
        return "SpyPlane : " + super.toString() + ", Source of energy :" + getSourceOfEnergy() + "Score Energy : C";
    }
}
