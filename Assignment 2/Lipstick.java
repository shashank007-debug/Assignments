class Lipstick {
    static void apply() {
        System.out.println("1. Applying Lipstick...");
    }

    static void remove() {
        apply();
        System.out.println("2. Removing Lipstick...");
    }

    static void showColor() {
        remove();
        System.out.println("3. Lipstick color is Red.");
    }

    static void price() {
        System.out.println("4. Lipstick costs $10.");
    }
}
