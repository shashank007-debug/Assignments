public class Balloon {
	String color;
    String material;
    double diameter;
    boolean isFilled;
    String shape;
    int capacity;

    // Constructor 1: No-argument constructor
    public Balloon() {
        this("Red", "Latex", 12.0, false, "Round", 1); 
    }

    // Constructor 2: With color parameter
    public Balloon(String color) {
        this(color, "Latex", 12.0, false, "Round", 1);
    }

    // Constructor 3: With color and material parameters
    public Balloon(String color, String material) {
        this(color, material, 12.0, false, "Round", 1);
    }

    // Constructor 4: With color, material, and diameter parameters
    public Balloon(String color, String material, double diameter) {
        this(color, material, diameter, false, "Round", 1);
    }

    // Constructor 5: With color, material, diameter, and isFilled parameters
    public Balloon(String color, String material, double diameter, boolean isFilled) {
        this(color, material, diameter, isFilled, "Round", 1);
    }

    // Constructor 6: With color, material, diameter, isFilled, and shape parameters
    public Balloon(String color, String material, double diameter, boolean isFilled, String shape) {
        this(color, material, diameter, isFilled, shape, 1);
    }

    // Constructor 7: With all parameters (main constructor)
    public Balloon(String color, String material, double diameter, boolean isFilled, String shape, int capacity) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isFilled = isFilled;
        this.shape = shape;
        this.capacity = capacity;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("Is Filled: " + (isFilled ? "Yes" : "No"));
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("-----------------------------");
    }
}