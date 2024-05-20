/*
 * Class Diagram:
 * 
 * Coin
 * 
 * sideUp: String
 * 
 * Coin(): void
 * toss(): void
 * getSideUp(): String
 * 
 */
package Coin;

import java.util.Random;

public class Coin {
    private String sideUp;

    public Coin() {
        toss();
    }

    public void toss() {
        Random rand = new Random();
        int side = rand.nextInt(2); // 0 for heads, 1 for tails
        if (side == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}

