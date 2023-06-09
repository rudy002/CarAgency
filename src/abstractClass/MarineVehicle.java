/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

public class MarineVehicle extends Vehicle {

    //Data members
    private String flag; // flag of the country the vehicle belongs to.

    private boolean WindDirection; // wind direction of the vehicle.
    //need to add other data member.

    public MarineVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, String flag, String path) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed, path);
        this.WindDirection = false;
        this.flag = flag;
    }

    //getters and setters
    public boolean setWindDirection(boolean windDirection) {
        if (this.WindDirection == windDirection) {
            return false;
        }
        else {
            this.WindDirection = windDirection;
            return true;
        }
    }

    public boolean getWindDirection() {
        return WindDirection;
    }

    public String getFlag() {
        return flag;
    }

    public Boolean setFlag(String flag){
        this.flag = flag;
        return true;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof MarineVehicle))
        {
            return false;
        }
        MarineVehicle v = (MarineVehicle) obj;
        return super.equals(obj) && v.flag.equals(this.flag) && v.WindDirection == this.WindDirection;
    }

    @Override
    public String toString() {
        String wind;
        if (getWindDirection()){wind = "same direction of the wind";}
        else {wind = "against direction of the wind";}
        return super.toString()+ "\n" + wind + "\n'Nationality Flag : " + getFlag();
    }




}
