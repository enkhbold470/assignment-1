package genetics;
/*
 * Class Design: HumanGenome
 * 
 * Variables: 
 * - genomeName: A string that holds the name of the genome.
 * - numberOfGenes: An integer that holds the number of genes in the genome.
 * - numberOfChromosomes: An integer that holds the number of chromosomes in the genome.
 * - numberOfCells: A long that holds the number of cells in the genome.
 * 
 * Input: 
 *  - HumanGenome(String genomeName, int numberOfGenes, int numberOfChromosomes, long numberOfCells): A constructor that initializes the genomeName, numberOfGenes, numberOfChromosomes, and numberOfCells of the genome.
 *  
 * Processing: 
 * - System.out.printf: A method that prints the details of the nucleic acid to the console.
 * 
 * 
 * Output: 
 * - getName(): A method that returns the name of the nucleic acid.
 * - getChemicalFormula(): A method that returns the chemical formula of the nucleic acid.
 * - getMolarMass(): A method that returns the molar mass of the nucleic acid.
 * - getDensity(): A method that returns the density of the nucleic acid.
 * 
 */
public class HumanGenome {
    private String genomeName;
    private int numberOfGenes;
    private int numberOfChromosomes;
    private long numberOfCells;

    public HumanGenome(String genomeName, int numberOfGenes, int numberOfChromosomes, long numberOfCells) {
        this.genomeName = genomeName;
        this.numberOfGenes = numberOfGenes;
        this.numberOfChromosomes = numberOfChromosomes;
        this.numberOfCells = numberOfCells;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public int getNumberOfGenes() {
        return numberOfGenes;
    }

    public void setNumberOfGenes(int numberOfGenes) {
        this.numberOfGenes = numberOfGenes;
    }

    public int getNumberOfChromosomes() {
        return numberOfChromosomes;
    }

    public void setNumberOfChromosomes(int numberOfChromosomes) {
        this.numberOfChromosomes = numberOfChromosomes;
    }

    public long getNumberOfCells() {
        return numberOfCells;
    }

    public void setNumberOfCells(long numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    public void print() {
        System.out.printf("Genome Name: %s\nNumber of Genes: %d\nNumber of Chromosomes: %d\nNumber of Cells: %d\n",
                genomeName, numberOfGenes, numberOfChromosomes, numberOfCells);
    }
} 