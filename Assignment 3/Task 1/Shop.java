class Shop{
	static void sell(String vegetable, int quantity){
		System.out.println("Running sell in Shop");
		System.out.println("Vegetable :"+vegetable+ " Quantity :"+quantity);
		Agent.purchase(vegetable, quantity);
	}
}