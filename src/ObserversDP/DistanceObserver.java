package ObserversDP;

import abstractClass.Vehicle;

import javax.swing.*;

public class DistanceObserver extends Observer {
    protected double distance;

    public DistanceObserver(double distance) {
        this.distance = distance;
    }

    @Override
    public void updating(double distance) {
        Vehicle.totalDistanceOfAllVehicle += distance;
        System.out.println("Distance: " + distance);
        JOptionPane.showMessageDialog(null, "Total Distance: " + Vehicle.totalDistanceOfAllVehicle, "Total Distance", JOptionPane.INFORMATION_MESSAGE);
    }

    public double getDistance() {
        return distance;
    }
}
