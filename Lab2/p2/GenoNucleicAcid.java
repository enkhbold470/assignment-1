/*
 * Class Design: GenoNucleicAcid
 * 
 * Variables: 
 * - name: A string that holds the name of the nucleic acid.
 * - chemicalFormula: A string that holds the chemical formula of the nucleic acid.
 * - molarMass: A double that holds the molar mass of the nucleic acid.
 * - density: A double that holds the density of the nucleic acid.
 * 
 * Input: 
 * - GenoNucleicAcid(String name, String chemicalFormula, double molarMass, double density): A constructor that initializes the name, chemicalFormula, molarMass, and density of the nucleic acid.
 * 
 * Processing: 
 * - System.out.printf: A method that prints the details of the nucleic acid to the console.
 * 
 * Output: 
 * - getName(): A method that returns the name of the nucleic acid.
 * - getChemicalFormula(): A method that returns the chemical formula of the nucleic acid.
 * - getMolarMass(): A method that returns the molar mass of the nucleic acid.
 * - getDensity(): A method that returns the density of the nucleic acid.
 */


import nucleic.NucleicAcid;


public class GenoNucleicAcid {
    public static void main(String[] args) {
        NucleicAcid cytosine = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
        NucleicAcid adenine = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
        NucleicAcid guanine = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.2f);
        NucleicAcid thymine = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
        NucleicAcid uracil = new NucleicAcid("Uracil", "C4H4N2O2", 112.08676f, 1.32f);

        System.out.println("Printing Nucleic Acids:");
        cytosine.print();
        adenine.print();
        guanine.print();
        thymine.print();
        uracil.print();
    }
}
