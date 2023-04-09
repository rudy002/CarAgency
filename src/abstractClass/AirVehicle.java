package abstractClass;

public abstract class AirVehicle extends Vehicle {

    //Data members
    enum AirVehicleType {civilian, military};

    private AirVehicleType type; // type of the vehicle.

    //need to add other data member.

    public AirVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, AirVehicleType type) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed);
        this.type = type;
    }

    public boolean setType(AirVehicleType type) {
        try {
            this.type = type;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
