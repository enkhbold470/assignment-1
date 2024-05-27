/*
 * CargoShip.java
 * This class is a subclass of Ship.
 * It contains additional attributes and methods specific to cargo ships.
 * Variables:
 * - cargoType: String
 * - loadingMethod: String
 * - numberOfCranes: int
 * - contraband: boolean
 * - cargoValue: float
 * Input: The class takes in the name, owner, and cargo type of the cargo ship.
 * Methods: CargoShip(String, String, String), loadCargo(), unloadCargo()
 * Processing: The CargoShip class is used to create CargoShip objects.
 * Output: The class does not return any output.
 * 
 */
package ShipPackage;

public class CargoShip extends Ship {
    private String cargoType;
    private String loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private float cargoValue;

    public CargoShip(String name, String owner, String cargoType) {
        super(name, owner);
        this.cargoType = cargoType;
    }

    @Override
    public void sail() {
        System.out.println(name + " (Cargo Ship) is sailing with cargo type: " + cargoType);
    }

    public void loadCargo() {
        System.out.println(name + " is loading cargo.");
    }

    public void unloadCargo() {
        System.out.println(name + " is unloading cargo.");
    }
}