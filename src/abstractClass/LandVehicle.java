/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

import javax.security.auth.callback.LanguageCallback;

public  class LandVehicle extends Vehicle implements ILand{
    //Data members
    public enum kindOfLand {dirt, paved};

    private kindOfLand type; // type of the land the vehicle is on.
    private int numberOfWheels; // number of wheels of the vehicle.

    //constructor
    public LandVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, kindOfLand type, int numberOfWheels, String path) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed, path);
        this.type = type;
        //setType(type);
        this.numberOfWheels = numberOfWheels;
    }

    //getters and setters
    public boolean setType(kindOfLand type) {
        try {
            this.type = type;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public kindOfLand getType() {
        return type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof LandVehicle))
        {
            return false;
        }
        LandVehicle v = (LandVehicle) obj;
        return super.equals(obj) && v.type == this.type && v.numberOfWheels == this.numberOfWheels;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind of Land : " + getType() + "\nNumber of wheels : " + getNumberOfWheels();
    }
}
