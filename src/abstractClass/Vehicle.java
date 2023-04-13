package abstractClass;

public abstract class Vehicle {


    //Data members
    private String modelName; // model name of the vehicle
    private double totalDistance; // total distance traveled by vehicle
    private int MaxNumberPassenger; // maximum number of passengers the vehicle can carry
    private double maxSpeed; // maximum speed of the vehicle

    //Constructors

    public Vehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed) {
        this.modelName = modelName;
        this.totalDistance = totalDistance;
        this.MaxNumberPassenger = MaxNumberPassenger;
        this.maxSpeed = maxSpeed;
    }

    public boolean setTotalDistance(double totalDistance) {
        try {
            this.totalDistance += totalDistance;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return "Model name: " + modelName + "\nTotal distance: " + totalDistance + "\nMax number of passengers: " + MaxNumberPassenger + "\nMax speed: " + maxSpeed;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Vehicle v = (Vehicle) obj;
        return (this.modelName == v.modelName && this.totalDistance == v.totalDistance && this.MaxNumberPassenger == v.MaxNumberPassenger && this.maxSpeed == v.maxSpeed);
    }
}


