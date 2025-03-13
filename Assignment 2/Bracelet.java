class Bracelet {
    static void type() {
        Wire.usage();
        Wire.insulation();
        System.out.println("21. Bracelet is made of silver.");
    }

    static void design() {
        System.out.println("22. Bracelet has a modern design.");
    }

    static void size() {
        type();
        design();
        System.out.println("23. Bracelet size is adjustable.");
    }

    static void price() {
        System.out.println("24. Bracelet costs $20.");
    }
}
