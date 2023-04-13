package abstractClass;

public abstract class MarineVehicle extends Vehicle {

    //Data members
    private String flag; // flag of the country the vehicle belongs to.

    private boolean WindDirection; // wind direction of the vehicle.
    //need to add other data member.

    public MarineVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, String flag) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed);
        this.flag = flag;
    }

    public boolean setWindDirection(boolean windDirection) {
        try {
            WindDirection = windDirection;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
