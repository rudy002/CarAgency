package DecoratorDP;

import abstractClass.Vehicle;

public class DataDecorator extends VehicleDecorator{
    //data members
    private String Color;
    private String status;
    public DataDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    //methods
    public Vehicle getVehicle(){
        return decorateVehicle;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
