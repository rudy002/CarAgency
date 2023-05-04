package RegularClasses;

import abstractClass.IComercial;
import abstractClass.IEngine;
import abstractClass.MarineVehicle;

public class CruiseShip extends MarineVehicle implements IEngine, IComercial {

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
        return false;
    }

    @Override
    public boolean SetLifeTimeEngine(double lifeTimeEngine) {
        return false;
    }
}
