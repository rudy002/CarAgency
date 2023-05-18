/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */
package RegularClasses;

import abstractClass.IEngine;
import abstractClass.LandVehicle;

public class ElectricBicycle extends LandVehicle implements IEngine {

    //data members
    private double averageFuelConsumption; // average fuel consumption of the vehicle.

    private double lifeTimeEngine; // lifetime of the engine.


    //Constructor
    public ElectricBicycle(String modelName, double maxSpeed, double lifeTimeEngine, String path) {
        super(modelName, 0, 2, maxSpeed, kindOfLand.dirt, 2, path);
        this.lifeTimeEngine = lifeTimeEngine;
//      SetLifeTimeEngine(lifeTimeEngine);
        this.averageFuelConsumption = 20;
//      SetAverageFuelConsumption(averageFuelConsumption);
    }

    //getters and setters
    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
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

    public double getLifeTimeEngine() {
        return lifeTimeEngine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElectricBicycle)) {
            return false;
        }
        ElectricBicycle v = (ElectricBicycle) obj;
        return super.equals(obj) && v.averageFuelConsumption == this.averageFuelConsumption && v.lifeTimeEngine == this.lifeTimeEngine;
    }

    @Override
    public String toString() {
        return "Jeep : " + super.toString() + "\nAverage Fuel Consummation : " + getAverageFuelConsumption() + "\nLife time of Engine : " + getLifeTimeEngine() + "\n\n";
    }

}
