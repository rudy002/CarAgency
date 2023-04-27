/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

public abstract class MarineVehicle extends Vehicle {

    //Data members
    private String flag; // flag of the country the vehicle belongs to.

    private boolean WindDirection; // wind direction of the vehicle.
    //need to add other data member.

    public MarineVehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, String flag) {
        super(modelName, totalDistance, MaxNumberPassenger, maxSpeed);
        this.WindDirection = false;
        this.flag = flag;
    }

    //getters and setters
    public boolean setWindDirection(boolean windDirection) {
        try {
            this.WindDirection = windDirection;
            return true;
        } catch (Exception e) {
            return false;
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
        return super.toString() + ", " + wind + ", Nationality Flag : " + getFlag();
    }




}
