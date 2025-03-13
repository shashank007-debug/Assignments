class TrafficSignal {
    static void red() {
        Lipstick.showColor();
        Lipstick.price();
        System.out.println("5. Traffic Light is Red - Stop!");
    }

    static void green() {
        System.out.println("6. Traffic Light is Green - Go!");
    }

    static void yellow() {
        red();
        System.out.println("7. Traffic Light is Yellow - Slow Down!");
    }

    static void blink() {
        yellow();
        green();
        System.out.println("8. Traffic Light is Blinking...");
    }
}