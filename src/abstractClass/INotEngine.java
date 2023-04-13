package abstractClass;

public interface INotEngine {

    public enum scoreEnergy { // enum for the energy score of the vehicle.
        A, B, C;
    }

    public boolean setSourceOfEnergy(String source); // set the source of energy of the vehicle.

    public Boolean scoreEnergy(scoreEnergy score); // set the score of the energy of the vehicle.
}
