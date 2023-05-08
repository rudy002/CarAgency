package RegularClasses;

import abstractClass.IComercial;
import abstractClass.IEngine;
import abstractClass.MarineVehicle;


public class CruiseShip extends MarineVehicle implements IEngine, IComercial {


    //data members
    private double averageFuelConsumption; // average fuel consumption of the vehicle.
    private double lifeTimeEngine; // lifetime of the engine.

    public CruiseShip(String modelName, int MaxNumberPassenger, double maxSpeed, String flag) {
        super(modelName, 0, MaxNumberPassenger, maxSpeed, flag);
        setWindDirection(true);

    }


    //methods
    @Override
    public typeLicense typeLicense() {
        return typeLicense.unlimited;
    }

    @Override
    public boolean SetAverageFuelConsumption(double Average) {

        if (Average < 0) {
            return false;
        }
        this.averageFuelConsumption = Average;
        return true;
    }

    @Override
    public boolean SetLifeTimeEngine(double lifeTimeEngine) {

        if (lifeTimeEngine < 0) {
            return false;
        }
        this.lifeTimeEngine = lifeTimeEngine;
        return true;
    }


    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public double getLifeTimeEngine() {
        return lifeTimeEngine;
    }


    @Override
    public String toString() {
        return super.toString() + "\nType of license: " + typeLicense() + "\nAverage fuel consumption: " + getAverageFuelConsumption() + "\nLife time of the engine: " + getLifeTimeEngine();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if(obj == this)
            return true;
        if(!(obj instanceof CruiseShip))
            return false;
        CruiseShip temp = (CruiseShip) obj;
        return super.equals(obj) && this.averageFuelConsumption == temp.averageFuelConsumption && this.lifeTimeEngine == temp.lifeTimeEngine;
    }
}
