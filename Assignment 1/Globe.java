class Globe {
    static void rotate() {
		System.out.println("Globe is rotating"); 
		}
    static void showContinents() { System.out.println("Displaying continents"); }
    static void showCountries() { System.out.println("Displaying countries"); }
    static void showOceans() { System.out.println("Displaying oceans"); }
    static void showTimeZones() { System.out.println("Displaying time zones"); }
    static void displayLatLong() { 
		rotate();
        showContinents();
        showCountries();
        showOceans();
        showTimeZones();
		System.out.println("Displaying latitude and longitude"); 
	}
    static void highlightPoles() { System.out.println("Highlighting North and South Poles"); }
    static void markCapitals() { System.out.println("Marking world capitals"); }
    static void educateGeography() { System.out.println("Educating on world geography"); }
    static void spinFast() { System.out.println("Spinning the globe faster"); }
}