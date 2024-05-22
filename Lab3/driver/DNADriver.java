/*
 * Class Design: NucleicAcid
 * 
 * Packages: genetics, driver
 * import: genetics.NucleicAcid, driver.DNADriver
 * Variables: LtoRHelix, RtoLHelix
 * Testing with String: AGCCTAGGATCAG, AGCCTAGGATCTAGGATCAG, AGCCTATAGGATCAG, AAAGCCTAGGATAGGATCAG, AAAGCCTCTGAGGATAGGATCAG
 * Input: strand from DNADriver.java (String) 
 * Processing: getNucleicAcidName, getComplementaryBase, LtoRHelixpopulate, print, highestMolarMass, totalDensity 
 * Output: LtoRHelix, RtoLHelix, highestMolarMass, totalDensity
 */
package driver;
import genetics.DNA;
public class DNADriver {
    public static void main(String[] args) {
        String[] testStrings = {
                "AGCCTAGGATCAG",
                "AGCCTAGGATCTAGGATCAG",
                "AGCCTATAGGATCAG",
                "AAAGCCTAGGATAGGATCAG",
                "AAAGCCTCTGAGGATAGGATCAG"
        };
        for (String testString : testStrings) {
            System.out.println("Testing with String: " + testString);
            DNA dna = new DNA(testString);
            // Test methods on the DNA object
            dna.print();
            dna.highestMolarMass();
            dna.totalDensity();
            System.out.println();
        }
    }
}
