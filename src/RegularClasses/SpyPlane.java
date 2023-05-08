/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package RegularClasses;
//import packages
import abstractClass.AirVehicle;
import abstractClass.INotEngine;

public class SpyPlane extends AirVehicle implements INotEngine {

    //data members
    private String sourceOfEnergy; // source of energy of the vehicle.



    //constructor
    public SpyPlane(String sourceOfEnergy, String path) {
        super("classified", 0, 1, 50, AirVehicleType.military, path);
        this.sourceOfEnergy = sourceOfEnergy;
        //setSourceOfEnergy(sourceOfEnergy);
    }

    //getters, setters and methods

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
    public scoreEnergy scoreEnergy() {
        return scoreEnergy.C;
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
        return super.equals(obj) && v.sourceOfEnergy.equals(this.sourceOfEnergy) ;
    }

    @Override
    public String toString() {
        return "SpyPlane : " + super.toString() + "\nSource of energy :" + getSourceOfEnergy() + "\nScore Energy : C"+ "\n\n";
    }
}
