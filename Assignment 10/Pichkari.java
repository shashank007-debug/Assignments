public class Pichkari {
    String color;
    double capacity; 
	String material;
    boolean isAutomatic;
    String waterPressure; 
    String brand;

    // Constructor 1: No-argument constructor
    public Pichkari() {
        this("Red", 1.5, "Plastic", false, "Medium", "Generic"); 
    }

    // Constructor 2: With color parameter
    public Pichkari(String color) {
        this(color, 1.5, "Plastic", false, "Medium", "Generic");
    }

    // Constructor 3: With color and capacity parameters
    public Pichkari(String color, double capacity) {
        this(color, capacity, "Plastic", false, "Medium", "Generic");
    }

    // Constructor 4: With color, capacity, and material parameters
    public Pichkari(String color, double capacity, String material) {
        this(color, capacity, material, false, "Medium", "Generic");
    }

    // Constructor 5: With color, capacity, material, and isAutomatic parameters
    public Pichkari(String color, double capacity, String material, boolean isAutomatic) {
        this(color, capacity, material, isAutomatic, "Medium", "Generic");
    }

    // Constructor 6: With color, capacity, material, isAutomatic, and waterPressure parameters
    public Pichkari(String color, double capacity, String material, boolean isAutomatic, String waterPressure) {
        this(color, capacity, material, isAutomatic, waterPressure, "Generic");
    }

    // Constructor 7: With all parameters (main constructor)
    public Pichkari(String color, double capacity, String material, boolean isAutomatic, String waterPressure, String brand) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.isAutomatic = isAutomatic;
        this.waterPressure = waterPressure;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Material: " + material);
        System.out.println("Is Automatic: " + (isAutomatic ? "Yes" : "No"));
        System.out.println("Water Pressure: " + waterPressure);
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}