/*
 * Ship.java
 * This class is the parent class of CargoShip and CruiseShip.
 * It contains the common attributes and methods of both classes.
 * Variables:
 * - floating: boolean
 * - capacity: int
 * - length: float
 * - width: float
 * - name: String
 * - height: float
 * - origin: String
 * - departureDate: String
 * - arrivalDate: String
 * - departingPort: String
 * - arrivalPort: String
 * - owner: String
 * Input: The class takes in the name and owner of the ship.
 * Methods: Ship(String, String), sail(), dock()
 * Processing: The Ship class is used to create Ship objects.
 * Output: The class does not return any output.
 * 
 */
package ShipPackage;

public class Ship {
    protected boolean floating;
    protected int capacity;
    protected float length;
    protected float width;
    protected String name;
    protected float height;
    protected String origin;
    protected String departureDate;
    protected String arrivalDate;
    protected String departingPort;
    protected String arrivalPort;
    protected String owner;

    public Ship(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void sail() {
        System.out.println(name + " is sailing.");
    }

    public void dock() {
        System.out.println(name + " is docking.");
    }
}