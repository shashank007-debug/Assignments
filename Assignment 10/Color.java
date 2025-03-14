public class Color {
    String name;
    String type; 
    boolean isEcoFriendly;
    double price; 
    int quantity; 
    String brand;

    // Constructor 1: No-argument constructor
    public Color() {
        this("Red", "Dry", true, 50.0, 100, "Generic"); 
    }

    // Constructor 2: With name parameter
    public Color(String name) {
        this(name, "Dry", true, 50.0, 100, "Generic");
    }

    // Constructor 3: With name and type parameters
    public Color(String name, String type) {
        this(name, type, true, 50.0, 100, "Generic");
    }

    // Constructor 4: With name, type, and isEcoFriendly parameters
    public Color(String name, String type, boolean isEcoFriendly) {
        this(name, type, isEcoFriendly, 50.0, 100, "Generic");
    }

    // Constructor 5: With name, type, isEcoFriendly, and price parameters
    public Color(String name, String type, boolean isEcoFriendly, double price) {
        this(name, type, isEcoFriendly, price, 100, "Generic");
    }

    // Constructor 6: With name, type, isEcoFriendly, price, and quantity parameters
    public Color(String name, String type, boolean isEcoFriendly, double price, int quantity) {
        this(name, type, isEcoFriendly, price, quantity, "Generic");
    }

    // Constructor 7: With all parameters (main constructor)
    public Color(String name, String type, boolean isEcoFriendly, double price, int quantity, String brand) {
        this.name = name;
        this.type = type;
        this.isEcoFriendly = isEcoFriendly;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    // Method to display all instance variables
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Is Eco-Friendly: " + (isEcoFriendly ? "Yes" : "No"));
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity + " grams");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}