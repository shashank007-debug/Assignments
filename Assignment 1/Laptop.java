class Laptop {
    static void powerOn() { 
		System.out.println("Laptop powering on"); 
		}
    static void powerOff() { System.out.println("Laptop shutting down"); }
    static void openApp() { System.out.println("Opening an application"); }
    static void connectWiFi() { System.out.println("Connecting to WiFi"); }
    static void chargeBattery() { System.out.println("Charging battery"); }
    static void restart() { System.out.println("Restarting laptop"); }
    static void updateSoftware() { 
		powerOn();
        openApp();
        connectWiFi();
        chargeBattery();
        restart();
		System.out.println("Updating software"); 
		}
    static void enableBluetooth() { System.out.println("Enabling Bluetooth"); }
    static void adjustBrightness() { System.out.println("Adjusting screen brightness"); }
    static void checkStorage() { System.out.println("Checking storage capacity"); }
}
