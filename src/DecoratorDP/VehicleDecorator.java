package DecoratorDP;

import abstractClass.Ivehicle;
import abstractClass.Vehicle;

import java.util.concurrent.locks.Lock;

public abstract class VehicleDecorator implements Ivehicle {
    protected Vehicle decorateVehicle;

    public VehicleDecorator(Vehicle decoratedVehicle) {
        this.decorateVehicle = decoratedVehicle;
    }

    //getters, setters and methods
    public void TravelDistance(double distance){
        decorateVehicle.TravelDistance(distance);
    }
    public boolean setTotalDistance(double totalDistance) {
        return decorateVehicle.setTotalDistance(totalDistance);
    }
    public String getModelName() {
        return decorateVehicle.getModelName();
    }
    public double getTotalDistance() {
        return decorateVehicle.getTotalDistance();
    }
    public int getMaxNumberPassenger() {
        return decorateVehicle.getMaxNumberPassenger();
    }
    public double getMaxSpeed() {
        return decorateVehicle.getMaxSpeed();
    }
    public String getPath() {
        return decorateVehicle.getPath();
    }
    public boolean setPath(String path) {
        return decorateVehicle.setPath(path);
    }
    public boolean equals(Object obj) {
        return decorateVehicle.equals(obj);
    }
    public String toString() {
        return decorateVehicle.toString();
    }
    public void startTest(double Distance) throws InterruptedException {
        decorateVehicle.startTest(Distance);
    }
    public boolean isInTest() {
        return decorateVehicle.isInTest();
    }
    public void startBuy() throws InterruptedException {
        decorateVehicle.startBuy();
    }
    public boolean isInBuy() {
        return decorateVehicle.isInBuy();
    }
    public Lock getLock() {
        return decorateVehicle.getLock();
    }
    public Lock getLockB() {
        return decorateVehicle.getLockB();
    }



}
