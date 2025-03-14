public class Water {
    String source; 
    double volume; 
    boolean isCold;
    double pHLevel; 
    String brand;

    // Constructor 1: No-argument constructor
    public Water() {
        this("Tap", 1.0, false, 7.0, "Generic"); 
    }

    // Constructor 2: With source parameter
    public Water(String source) {
        this(source, 1.0, false, 7.0, "Generic");
    }

    // Constructor 3: With source and volume parameters
    public Water(String source, double volume) {
        this(source, volume, false, 7.0, "Generic");
    }

    // Constructor 4: With source, volume, and isCold parameters
    public Water(String source, double volume, boolean isCold) {
        this(source, volume, isCold, 7.0, "Generic");
    }

    // Constructor 5: With source, volume, isCold, and pHLevel parameters
    public Water(String source, double volume, boolean isCold, double pHLevel) {
        this(source, volume, isCold, pHLevel, "Generic");
    }

    // Constructor 6: With all parameters (main constructor)
    public Water(String source, double volume, boolean isCold, double pHLevel, String brand) {
        this.source = source;
        this.volume = volume;
        this.isCold = isCold;
        this.pHLevel = pHLevel;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Source: " + source);
        System.out.println("Volume: " + volume + " liters");
        System.out.println("Is Cold: " + (isCold ? "Yes" : "No"));
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}