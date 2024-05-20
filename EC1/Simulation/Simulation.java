/*
 * Class Diagram:
 * 
 * Simulation
 * 
 * heads: int
 * tails: int
 * 
 * Simulation(): void
 * tossForSimulation(coin: Coin, count: int): void
 * printStats(): void
 * 
 */
package Simulation;
import Coin.Coin;

public class Simulation {
        private int heads;
        private int tails;
    
        public Simulation() {
            heads = 0;
            tails = 0;
        }
    
        public void tossForSimulation(Coin coin, int count) {
            for (int i = 0; i < count; i++) {
                coin.toss();
                if (coin.getSideUp().equals("Heads")) {
                    heads++;
                } else {
                    tails++;
                }
            }
        }
    
        public void printStats() {
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
        }
    }
