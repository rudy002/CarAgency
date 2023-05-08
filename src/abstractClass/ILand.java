package abstractClass;

public interface ILand {
    public enum kindOfLand {dirt, paved};
    public boolean setType(LandVehicle.kindOfLand type);
    public LandVehicle.kindOfLand getType();
    public int getNumberOfWheels();
    public boolean equals(Object obj);
    public String toString();
}
