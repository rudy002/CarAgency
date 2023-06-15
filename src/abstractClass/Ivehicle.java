package abstractClass;

import java.util.concurrent.locks.Lock;

public interface Ivehicle {
    public void TravelDistance(double distance);
    public boolean setTotalDistance(double totalDistance);
    public String getModelName();
    public double getTotalDistance();
    public int getMaxNumberPassenger();
    public double getMaxSpeed();
    public String getPath();
    public boolean setPath(String path);
    public boolean equals(Object obj);
    public String toString();
    public void startTest(double Distance) throws InterruptedException;
    public boolean isInTest();
    public Lock getLock();
    public void startBuy() throws InterruptedException;
    public boolean isInBuy();
    public Lock getLockB();

}
