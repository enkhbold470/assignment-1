/*
 * Driver class to run the simulation
 * Author: Enkhbold Ganbold
 * Date: 05/10/2024
 * 
 * Design:
 * 
 * Variables:
 * Coin coin - Coin object, this objet is used from subfolder named Coin, which is a package
 * Simulation simulation - Simulation object, this object is used from subfolder named Simulation, which is a package
 * 
 * 
 * Input: None, because I use library that randomly generates heads or tails
 * 
 * Output: 
 * The program will display the number of times the coin landed on heads and the number of times it landed on tails.
 * 
 * Processing:
 * The program will create a Coin object and a Simulation object. The program will then call the tossForSimulation method
 * 
 */

/*
 * Class Diagram:
 *  
 *  Coin
 *  
 *  toss(): void
 * 
 */

import Coin.Coin;
import Simulation.Simulation;

public class Driver {
    public static void main(String[] args) {
        Coin coin = new Coin();
        Simulation simulation = new Simulation();
        simulation.tossForSimulation(coin, 20);
        simulation.printStats();
    }
}
