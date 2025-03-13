// 1. Runner.main-->Customer.buy(vegetable,quantity)-->Shop.sell(vegetable,quantity)--> Agent.purchase(vegetable,quantity)-->Broker.brokerage(vegetable,quantity)--> Farmer.farm(vegetable,quantity);
class Broker{
	static void brokerage(String vegetable, int quantity){
		System.out.println("Running brokerage in Broker");
		System.out.println("Vegetable :"+vegetable+ " Quantity :"+quantity);
		Farmer.farm(vegetable,quantity);
	}
}