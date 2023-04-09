package RegularClasses;

//import packages
import abstractClass.IComercial;
import abstractClass.IEngine;
import abstractClass.LandVehicle;

public class Jeep extends LandVehicle implements IEngine, IComercial {

    //data members
    private double averageFuelConsumption; // average fuel consumption of the vehicle.

    private double lifeTimeEngine; // lifetime of the engine.

    //Constructor
    public Jeep(String modelName, double totalDistance, double maxSpeed, double averageFuelConsumption, double lifeTimeEngine) {
        super(modelName, 0, 5, maxSpeed, kindOfLand.dirt, 4);

        SetAverageFuelConsumption(averageFuelConsumption);

    }

    @Override //from interface IComercial
    public String typeLicense() {
        return typeLicense.mini.toString();
    }

    @Override //from interface IEngine
    public boolean SetAverageFuelConsumption(double Average) {
        try {
            if (Average < 0) {
                throw new Exception("Average fuel consumption can't be negative");
            }
            this.averageFuelConsumption = Average;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override //from interface IEngine
    public boolean SetLifeTimeEngine(double lifeTimeEngine) {
        try {
            if (lifeTimeEngine < 0) {
                throw new Exception("Life time of the engine can't be negative");
            }
            this.lifeTimeEngine = lifeTimeEngine;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
