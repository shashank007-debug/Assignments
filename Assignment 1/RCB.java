class RCB {
    static void selectSquad() { 
		System.out.println("Selecting RCB squad"); 
		}
    static void trainPlayers() { System.out.println("Training players"); }
    static void playMatch() { System.out.println("Playing a match"); }
    static void winTrophy() { System.out.println("Winning IPL Trophy"); }
    static void announceCaptain() { System.out.println("Announcing team captain"); }
    static void buyPlayers() { 
		selectSquad();
        trainPlayers();
        playMatch();
        winTrophy();
        announceCaptain();
		System.out.println("Buying new players"); 
	}
    static void sellPlayers() { System.out.println("Selling existing players"); }
    static void releaseJersey() { System.out.println("Releasing new jersey"); }
    static void hireCoach() { System.out.println("Hiring a new coach"); }
    static void manageSponsors() { System.out.println("Managing sponsorships"); }
}