/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package RegularClasses;
//import packages
import abstractClass.IEngine;
import abstractClass.MarineVehicle;

public class Frigate extends MarineVehicle implements IEngine {

    //data members

    private double averageFuelConsumption; // average fuel consumption of the vehicle.

    private double lifeTimeEngine; // lifetime of the engine.

    //Constructor
    public Frigate(String modelName, int MaxNumberPassenger, double maxSpeed, String path) {
        super(modelName, 0, MaxNumberPassenger, maxSpeed, "Israel", path);
        this.averageFuelConsumption = 500;
        //SetAverageFuelConsumption(500);
        this.lifeTimeEngine = 4;
        //SetLifeTimeEngine(4);
    }


    //getters and setters
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

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
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

    //Methods
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof Frigate))
        {
            return false;
        }
        Frigate v = (Frigate) obj;
        return super.equals(obj) && v.averageFuelConsumption == this.averageFuelConsumption && v.lifeTimeEngine == this.lifeTimeEngine;
    }

    @Override
    public String toString() {
        return "Frigate : " + super.toString() + "\nAverage Fuel Consummation : " + getAverageFuelConsumption() + "\nLifeTime of Engine : " + getLifeTimeEngine() + "\n\n";
    }



}
