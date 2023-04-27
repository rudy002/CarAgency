/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

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
    public Jeep(String modelName, double maxSpeed, double averageFuelConsumption, double lifeTimeEngine) {
        super(modelName, 0, 5, maxSpeed, kindOfLand.dirt, 4);
        this.lifeTimeEngine = lifeTimeEngine;
//        SetLifeTimeEngine(lifeTimeEngine);
        this.averageFuelConsumption = averageFuelConsumption;
//        SetAverageFuelConsumption(averageFuelConsumption);
    }

    @Override //from interface ICommercial
    public String typeLicense() {
        return typeLicense.mini.toString();
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
        if(!(obj instanceof Jeep))
        {
            return false;
        }
        Jeep v = (Jeep) obj;
        return super.equals(obj) && v.averageFuelConsumption == this.averageFuelConsumption && v.lifeTimeEngine == this.lifeTimeEngine;
    }

    @Override
    public String toString() {
        return "Jeep : " + super.toString() + ",  Average Fuel Consummation : " + getAverageFuelConsumption() + ", life time of Engine : " + getLifeTimeEngine() + ", type of license : " + typeLicense();
    }

}
