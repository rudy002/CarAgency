/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

public abstract class AirVehicle extends Vehicle {

    //Data members
    protected enum AirVehicleType {civilian, military};

    protected AirVehicleType type; // type of the vehicle.

    //need to add other data member.


    //constructor
    public AirVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, AirVehicleType type, String path) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed, path);
        this.type = type;
        //setType(type);
    }

    //getters and setters
    public boolean setType(AirVehicleType type) {
        try {
            this.type = type;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public AirVehicleType getType() {
        return type;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof AirVehicle))
        {
            return false;
        }
        AirVehicle v = (AirVehicle) obj;
        return super.equals(obj) && v.type == this.type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAir vehicle type : " + getType();
    }
}
