/*
 * CruiseShip.java
 * This class is a subclass of Ship.
 * It contains additional attributes and methods specific to cruise ships.
 * Variables:
 * - ticketPrice: float
 * - numberOfRooms: int
 * - buffetMenu: String
 * - services: String[]
 * - cruiseType: String
 * Input: The class takes in the name, owner, and ticket price of the cruise ship.
 * Methods: CruiseShip(String, String, float), provideService()
 * Processing: The CruiseShip class is used to create CruiseShip objects.
 * Output: The class does not return any output.
 * 
 */
package ShipPackage;

public class CruiseShip extends Ship {
    private float ticketPrice;
    private int numberOfRooms;
    private String buffetMenu;
    private String[] services;
    private String cruiseType;

    public CruiseShip(String name, String owner, float ticketPrice) {
        super(name, owner);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void sail() {
        System.out.println(name + " (Cruise Ship) is sailing with ticket price: $" + ticketPrice);
    }

    @Override
    public void dock() {
        System.out.println(name + " (Cruise Ship) is docking.");
    }

    public void provideService() {
        System.out.println(name + " is providing services to guests.");
    }
}
