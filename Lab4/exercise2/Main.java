
/*
 * Main.java
 * This class is the driver class for the ShipPackage.
 * It creates Ship, CargoShip, and CruiseShip objects and calls their methods.
 * Variables:
 * - ships: Ship[]
 * Input: The class does not take in any input.
 * Methods: main(String[])
 * Processing: The Main class creates Ship, CargoShip, and CruiseShip objects and calls their methods.
 * Output: The class does not return any output.
 * 
 */
import ShipPackage.Ship;
import ShipPackage.CargoShip;
import ShipPackage.CruiseShip;

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Generic Ship", "Generic Owner");
        ships[1] = new CargoShip("Cargo King", "Cargo Owner", "Electronics");
        ships[2] = new CruiseShip("Cruise Queen", "Cruise Owner", 999.99f);

        for (Ship ship : ships) {
            ship.sail();
            ship.dock();
            System.out.println();
        }

        // Specific behaviors
        CargoShip cargoShip = (CargoShip) ships[1];
        cargoShip.loadCargo();
        cargoShip.unloadCargo();

        CruiseShip cruiseShip = (CruiseShip) ships[2];
        cruiseShip.provideService();
    }
}