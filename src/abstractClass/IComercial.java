/*
Sarah Khalifa : 342513066
Rudy Haddad : 336351481
 */

package abstractClass;

public interface IComercial {

    public static enum typeLicense { // enum for the type of license of the vehicle.
        mini, limit, unlimit;
    }
    public String typeLicense(); // set the type of license of the vehicle.
}
