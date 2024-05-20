/*
 * Class Design: GenomeInput
 * 
 * Variables: 
 * - genomes: An array of HumanGenome objects to store the details of the genomes.
 * - scanner: A Scanner object to read input from the console.
 * 
 * Input: 
 * - main(String[] args): The main method that is the entry point of the program. It creates an array of HumanGenome objects and reads input from the user to populate the array.
 * 
 * Processing: 
 * - main(String[] args): This method creates an array of HumanGenome objects and reads input from the user to populate the array. It then prints the details of each HumanGenome object.
 * 
 * Output: 
 * - main(String[] args): This method doesn't return anything. It prints the details of each HumanGenome object to the console.
 * Testrun:
 * Genome Name: Human Bob
Number of Genes: 20000
Number of Chromosomes: 46
Number of Cells: 76

Genome Name: Human Sally
Number of Genes: 20000
Number of Chromosomes: 46
Number of Cells: 120

Genome Name: Human Sri
Number of Genes: 20000
Number of Chromosomes: 46
Number of Cells: 75
 */
import java.util.Scanner;
import genetics.HumanGenome;

public class GenomeInput {
    public static void main(String[] args) {
        HumanGenome[] genomes = new HumanGenome[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter genome name:");
            String genomeName = scanner.nextLine();

            System.out.println("Enter number of genes:");
            int numberOfGenes = scanner.nextInt();

            System.out.println("Enter number of chromosomes:");
            int numberOfChromosomes = scanner.nextInt();

            System.out.println("Enter number of cells:");
            long numberOfCells = scanner.nextLong();
            scanner.nextLine(); // Consume newline left-over

            genomes[i] = new HumanGenome(genomeName, numberOfGenes, numberOfChromosomes, numberOfCells);
        }

        scanner.close();

        // Print the details of each HumanGenome object
        for (HumanGenome genome : genomes) {
            genome.print();
            System.out.println();
        }
    }
}