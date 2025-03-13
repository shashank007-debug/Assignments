class Agent{
	static void purchase(String vegetable, int quantity){
		System.out.println("Running purchase in Agent");
		System.out.println("Vegetable :"+vegetable+ " Quantity :"+quantity);
		Broker.brokerage(vegetable,quantity);
	}
}