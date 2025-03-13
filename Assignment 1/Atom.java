class Atom {
    static void split() { 
		System.out.println("Splitting an atom"); 
		}
    static void fuse() { System.out.println("Fusing atoms together"); }
    static void generateEnergy() { System.out.println("Generating atomic energy"); }
    static void formMolecule() { System.out.println("Forming a molecule"); }
    static void showProtons() { System.out.println("Showing protons"); }
    static void showNeutrons() {
		split();
        fuse();
        generateEnergy();
        formMolecule();
        showProtons();
		System.out.println("Showing neutrons"); 
	}
    static void showElectrons() { System.out.println("Showing electrons"); }
    static void ionize() { System.out.println("Ionizing an atom"); }
    static void emitRadiation() { System.out.println("Emitting atomic radiation"); }
    static void combineElements() { System.out.println("Combining elements at the atomic level"); }
}
