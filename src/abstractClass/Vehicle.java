/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Vehicle {


    //Data members
    private String modelName; // model name of the vehicle
    private double totalDistance; // total distance traveled by vehicle
    private int MaxNumberPassenger; // maximum number of passengers the vehicle can carry
    private double maxSpeed; // maximum speed of the vehicle
    private boolean inTest = false;

    private static Object sharedLock = new Object(); // Verrou partagé pour la synchronisation des threads


    private String path;

    //Constructors
    public Vehicle(String modelName, double totalDistance, int MaxNumberPassenger, double maxSpeed, String path) {
        this.modelName = modelName;
        this.totalDistance = totalDistance;
        this.MaxNumberPassenger = MaxNumberPassenger;
        this.maxSpeed = maxSpeed;
        this.path = path;
    }

    public void TravelDistance(double distance){
        double dis = getTotalDistance() + distance;
        setTotalDistance(dis);
    }

    //getters and setters
    public boolean setTotalDistance(double totalDistance) {
        if (totalDistance >=0) {
            this.totalDistance = totalDistance;
            return true;
        }
        else return false;
    }



    public String getModelName() {
        return modelName;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public int getMaxNumberPassenger() {
        return MaxNumberPassenger;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getPath() {
        return path;
    }

    public boolean setPath(String path) {
        this.path = path;
        return true;
    }

    public static Object getSharedLock() {
        return sharedLock;
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
        if(!(obj instanceof Vehicle))
        {
            return false;
        }
        Vehicle v = (Vehicle) obj;
        return (this.modelName.equals(v.modelName) && this.totalDistance == v.totalDistance && this.MaxNumberPassenger == v.MaxNumberPassenger && this.maxSpeed == v.maxSpeed);
    }

    @Override
    public String toString() {
        return "Model name: " + getModelName() + "\nTotal distance: " + getTotalDistance() + "\nMaximum number of passengers: " + getMaxNumberPassenger() + "\nMaximum speed: " + getMaxSpeed();
    }

    public synchronized void startTest(double distance) throws InterruptedException {

        synchronized (sharedLock) {

            if (inTest) {
                throw new IllegalStateException("This vehicle is already being tested.");
            }

            inTest = true;
            // Effectuer les actions nécessaires pour le test

            // Faire dormir le thread pendant la durée du test
            long sleepTime = (long) (distance * 100);
            Thread.sleep(sleepTime);

            // Effectuer d'autres actions après le test

            inTest = false;
        }
    }

    public synchronized boolean isInTest() {
        return inTest;
    }

}



