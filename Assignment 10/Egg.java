public class Egg {
    String color;
    String size;
    boolean isFilled;
    double weight;
    String brand;

    // Constructor 1: No-argument constructor
    public Egg() {
        this("White", "Medium", false, 50.0, "Generic"); 
    }

    // Constructor 2: With color parameter
    public Egg(String color) {
        this(color, "Medium", false, 50.0, "Generic");
    }

    // Constructor 3: With color and size parameters
    public Egg(String color, String size) {
        this(color, size, false, 50.0, "Generic");
    }

    // Constructor 4: With color, size, and isFilled parameters
    public Egg(String color, String size, boolean isFilled) {
        this(color, size, isFilled, 50.0, "Generic");
    }

    // Constructor 5: With color, size, isFilled, and weight parameters
    public Egg(String color, String size, boolean isFilled, double weight) {
        this(color, size, isFilled, weight, "Generic");
    }

    // Constructor 6: With all parameters (main constructor)
    public Egg(String color, String size, boolean isFilled, double weight, String brand) {
        this.color = color;
        this.size = size;
        this.isFilled = isFilled;
        this.weight = weight;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Is Filled: " + (isFilled ? "Yes" : "No"));
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}