class Lollipop {
    static void unwrap() { 
		System.out.println("Unwrapping the lollipop"); 
	}
    static void lick() { System.out.println("Licking the lollipop"); }
    static void bite() { System.out.println("Biting the lollipop"); }
    static void finish() { System.out.println("Finishing the lollipop"); }
    static void throwStick() { System.out.println("Throwing away the stick"); }
    static void share() { 
		unwrap();
        lick();
        bite();
        finish();
        throwStick();
		System.out.println("Sharing the lollipop"); 
		}
    static void changeFlavor() { System.out.println("Changing the flavor"); }
    static void dissolve() { System.out.println("Dissolving in mouth"); }
    static void breakHalf() { System.out.println("Breaking into two halves"); }
    static void checkExpiry() { System.out.println("Checking expiry date"); }
}