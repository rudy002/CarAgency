package abstractClass;

public interface INotEngine {

    public enum scoreEnergy { // enum for the energy score of the vehicle.
        A, B, C;
    }

    public String setSourceOfEnergy(); // set the source of energy of the vehicle.

    public char scoreEnergy(); // set the score of the energy of the vehicle.
}
