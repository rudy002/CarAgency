/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */


package RegularClasses;
import abstractClass.*;


public class HybridPlane extends AirVehicle implements IEngine, IMarine, ILand{

    //data members
    private double averageFuelConsumption; // average fuel consumption of the vehicle.
    private double lifeTimeEngine; // lifetime engine of the vehicle.

    private MarineVehicle MarineVehicle;
    private LandVehicle LandVehicle;


    //constructor

    public HybridPlane(String modelName, double maxSpeed, int numberOfWheels, double averageFuelConsumption, double lifeTimeEngine,int MaxNumberPassengers, String path) {
        super(modelName, 0, MaxNumberPassengers, maxSpeed, AirVehicleType.military,path);
        this.averageFuelConsumption = averageFuelConsumption;
        this.lifeTimeEngine = lifeTimeEngine;
        LandVehicle = new LandVehicle(modelName, 0, MaxNumberPassengers, maxSpeed , abstractClass.LandVehicle.kindOfLand.paved, numberOfWheels, path);
        MarineVehicle = new MarineVehicle(modelName, 0, MaxNumberPassengers, maxSpeed, "Israel", path);
    }

    //getter and setter

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }
    public double getLifeTimeEngine() {
        return lifeTimeEngine;
    }

    @Override
    public boolean SetAverageFuelConsumption(double Average) {
        if (Average > 0) {
            this.averageFuelConsumption = Average;
            return true;
        }
        return false;
    }
    @Override
    public boolean SetLifeTimeEngine(double lifeTimeEngine) {
        if (lifeTimeEngine > 0) {
            this.lifeTimeEngine = lifeTimeEngine;
            return true;
        }
        return false;
    }

    @Override
    public boolean setType(abstractClass.LandVehicle.kindOfLand type) {
        LandVehicle.setType(type);
        return true;
    }

    @Override
    public LandVehicle.kindOfLand getType() {
        return LandVehicle.getType();
    }

    @Override
    public int getNumberOfWheels() {
        return LandVehicle.getNumberOfWheels();
    }

    @Override
    public boolean setWindDirection(boolean windDirection) {
        MarineVehicle.setWindDirection(windDirection);
        return true;
    }

    @Override
    public boolean getWindDirection() {
        return MarineVehicle.getWindDirection();
    }

    @Override
    public String getFlag() {
        return MarineVehicle.getFlag();
    }

    @Override
    public Boolean setFlag(String flag) {
        MarineVehicle.setFlag(flag);
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof HybridPlane)) {
            return false;
        }
        HybridPlane v = (HybridPlane) obj;
        return super.equals(obj) && v.getAverageFuelConsumption() == this.averageFuelConsumption && v.getLifeTimeEngine() == this.lifeTimeEngine && v.LandVehicle.equals(this.LandVehicle) && v.MarineVehicle.equals(this.MarineVehicle);
    }

    @Override
    public String toString() {
        String wind = "Against direction of wind";
        if(getWindDirection()) {
            wind = "With direction of wind";
        }
        return "HybridPlane : " + super.toString() + "\nAverage Fuel Consumption: " + this.averageFuelConsumption + "\n" + "Life Time Engine: " + this.lifeTimeEngine + "\nKind Of Land :" + getType() + "\nNumber Of Wheels: " + getNumberOfWheels() + "\nWind Direction: " + wind + "\nFlag: " + getFlag() + "\n";
    }

}