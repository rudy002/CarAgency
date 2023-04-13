package RegularClasses;
//import packages
import abstractClass.IComercial;
import abstractClass.IEngine;
import abstractClass.MarineVehicle;

public class Frigate extends MarineVehicle implements IEngine {

    //data members

    private double averageFuelConsumption; // average fuel consumption of the vehicle.

    private double lifeTimeEngine; // lifetime of the engine.

    //Constructor

    public Frigate(String modelName, int MaxNumberPassenger, double maxSpeed) {
        super(modelName, 0, MaxNumberPassenger, maxSpeed, "Israel");
        SetAverageFuelConsumption(500);
        SetLifeTimeEngine(4);
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
