package genetics;
import genetics.NucleicAcid;
import driver.DNADriver;

/*
 * Class Design: NucleicAcid
 * 
 * Packages: genetics, driver
 * import: genetics.NucleicAcid, driver.DNADriver
 * Variables: LtoRHelix, RtoLHelix
 * Input: strand from DNADriver.java (String) 
 * Processing: getNucleicAcidName, getComplementaryBase, LtoRHelixpopulate, print, highestMolarMass, totalDensity 
 * Output: LtoRHelix, RtoLHelix, highestMolarMass, totalDensity
 */

public class DNA {

    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    // Default constructor
    public DNA() {
        this.LtoRHelix = null;
        this.RtoLHelix = null;
    }

    // Overloaded constructor with String parameter
    public DNA(String strand) {
        this.LtoRHelix = new NucleicAcid[strand.length()];
        this.RtoLHelix = new NucleicAcid[strand.length()];
        LtoRHelixpopulate(strand);
    }

    // Populates LtoRHelix with NucleicAcid objects from the input string
    public void LtoRHelixpopulate(String strand) {
        for (int i = 0; i < strand.length(); i++) {
            char base = strand.charAt(i);
            this.LtoRHelix[i] = new NucleicAcid(getNucleicAcidName(base), strand, getComplementaryBase(base), i);
        }
    }

    // Helper method to get the name of the NucleicAcid based on the base character
    private String getNucleicAcidName(char base) {
        switch (base) {
            case 'A':
                return "Adenine";
            case 'T':
                return "Thymine";
            case 'C':
                return "Cytosine";
            case 'G':
                return "Guanine";
            default:
                throw new IllegalArgumentException("Invalid base character: " + base);
        }
    }

    // Helper method to get the complementary base for a given base
    private char getComplementaryBase(char base) {
        switch (base) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                throw new IllegalArgumentException("Invalid base character: " + base);
        }
    }

    // Prints the properties of each NucleicAcid in both strands
    public void print() {
        System.out.println("LtoR Helix:");
        for (NucleicAcid acid : LtoRHelix) {
            if (acid != null) {
                acid.print();
            }
        }
        System.out.println("\nRtoL Helix:");
        for (NucleicAcid acid : RtoLHelix) {
            if (acid != null) {
                acid.print();
            }
        }
    }

    // Finds and prints the index and MolarMass of the highest MolarMass NucleicAcid
    public void highestMolarMass() {
        double highestMass = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < LtoRHelix.length; i++) {
            if (LtoRHelix[i] != null && LtoRHelix[i].getMolarMass() > highestMass) {
                highestMass = LtoRHelix[i].getMolarMass();
                index = i;
            }
            if (RtoLHelix[i] != null && RtoLHelix[i].getMolarMass() > highestMass) {
                highestMass = RtoLHelix[i].getMolarMass();
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Highest Molar Mass: " + highestMass + " g/mol at index: " + index);
        } else {
            System.out.println("No NucleicAcid objects found");
        }
    }

    // Calculates and prints the total density of all NucleicAcid objects
    public void totalDensity() {
        double totalDensity = 0;
        for (NucleicAcid acid : LtoRHelix) {
            if (acid != null) {
                totalDensity += acid.getDensity();
            }
        }
        for (NucleicAcid acid : RtoLHelix) {
            if (acid != null) {
                totalDensity += acid.getDensity();
            }
        }
        System.out.println("Total Density: " + totalDensity + " g/cm3");
    }
}
