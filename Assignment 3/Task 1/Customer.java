class Customer{
	static void buy(String vegetable, int quantity){
		System.out.println("Running buy in Customer");
		System.out.println("Vegetable :"+vegetable+ " Quantity :"+quantity);
		Shop.sell(vegetable, quantity);
		
	}
}