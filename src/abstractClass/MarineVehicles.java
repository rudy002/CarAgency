package abstractClass;

public abstract class MarineVehicles extends Vehicle {

    //Data members
    private String flag; // flag of the country the vehicle belongs to.
    private double displacement; // displacement of the vehicle.

    private boolean WindDirection; // wind direction of the vehicle.
    //need to add other data member.

    public MarineVehicles(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, String flag, double displacement) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed);
        this.flag = flag;
        this.displacement = displacement;
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
