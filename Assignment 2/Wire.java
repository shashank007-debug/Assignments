class Wire {
    static void material() {
        Gold.uses();
        Gold.shine();
        System.out.println("17. Wire is made of copper.");
    }

    static void conductivity() {
        System.out.println("18. Wire is highly conductive.");
    }

    static void usage() {
        material();
        conductivity();
        System.out.println("19. Wire is used in electrical circuits.");
    }

    static void insulation() {
        System.out.println("20. Wire is insulated with plastic.");
    }
}