package RegularClasses;

import abstractClass.INotEngine;
import abstractClass.LandVehicle;

public class Bicycle extends LandVehicle implements INotEngine {

    //data members
    private String sourceOfEnergy; // source of energy of the vehicle.

    public Bicycle(String modelName, kindOfLand type) {
        super(modelName, 0, 1, 15, type, 2);
        this.sourceOfEnergy = "Manual";
    }

    //getter and setter
    public String getSourceOfEnergy() {
        return sourceOfEnergy;
    }


    //methods
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
    public scoreEnergy scoreEnergy() {
        return scoreEnergy.A;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSource of energy: " + getSourceOfEnergy();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Bicycle)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Bicycle b = (Bicycle) obj;
        return super.equals(obj) && getSourceOfEnergy().equals(b.sourceOfEnergy);
    }
}
