package abstractClass;

public abstract class LandVehicle extends Vehicle{
    //Data members
    protected enum kindOfLand {dirt, paved};

    private kindOfLand type; // type of the land the vehicle is on.
    private int numberOfWheels; // number of wheels of the vehicle.

    //constructor
    public LandVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, kindOfLand type, int numberOfWheels) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed);
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

}
