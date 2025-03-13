class Supra {
    static void startEngine() { 
		System.out.println("Starting Supra engine"); 
		}
    static void accelerate() { System.out.println("Accelerating the Supra"); }
    static void drift() { System.out.println("Drifting the Supra"); }
    static void brake() { System.out.println("Applying brakes on the Supra"); }
    static void refuel() { System.out.println("Refueling the Supra"); }
    static void boostTurbo() { 
		startEngine();
        accelerate();
        drift();
        brake();
        refuel();
		System.out.println("Boosting turbo power"); 
	}
    static void checkSpeed() { System.out.println("Checking speedometer"); }
    static void playMusic() { System.out.println("Playing music in Supra"); }
    static void enableSportMode() { System.out.println("Enabling sport mode"); }
    static void parkCar() { System.out.println("Parking the Supra"); }
}
