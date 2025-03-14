public class Bucket {
    String color;
    double capacity; 
    String material;
    String handleType; 
    String brand;

    // Constructor 1: No-argument constructor
    public Bucket() {
        this("Blue", 10.0, "Plastic", "Plastic", "Generic"); 
    }

    // Constructor 2: With color parameter
    public Bucket(String color) {
        this(color, 10.0, "Plastic", "Plastic", "Generic");
    }

    // Constructor 3: With color and capacity parameters
    public Bucket(String color, double capacity) {
        this(color, capacity, "Plastic", "Plastic", "Generic");
    }

    // Constructor 4: With color, capacity, and material parameters
    public Bucket(String color, double capacity, String material) {
        this(color, capacity, material, "Plastic", "Generic");
    }

    // Constructor 5: With color, capacity, material, and handleType parameters
    public Bucket(String color, double capacity, String material, String handleType) {
        this(color, capacity, material, handleType, "Generic");
    }

    // Constructor 6: With all parameters (main constructor)
    public Bucket(String color, double capacity, String material, String handleType, String brand) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.handleType = handleType;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Material: " + material);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}