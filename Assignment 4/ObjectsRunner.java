class ObjectsRunner{
	public static void main(String[] args){
		System.out.println("===================================================================================================================");
		String name = Objects.getName(987654325760L);
		System.out.println("The Name of Person for Respective Mobile Number :"+name);
		System.out.println("===================================================================================================================");
		String ownerName = Objects.getOwnerName("tesla");
		System.out.println("The Owner name by their Company Name :"+ownerName);
		System.out.println("===================================================================================================================");
		double price = Objects.getPrice("Biriyani");
		if(price == -1){
			System.out.println("The Food Item is not in the menu");
		}else{
			System.out.println("The Requested Food Item is price is :"+price);
		}
		System.out.println("===================================================================================================================");
		double balance = Objects.getBalance(1001001001L);
		if(balance == -1){
			System.out.println("The Account number not found");
		}else{
			System.out.println("The Balancce of Provided Account number is :"+balance);
		}
		System.out.println("===================================================================================================================");
		double priceOfSource = Objects.getPriceBySource("gold");
		if(priceOfSource == -1){
			System.out.println("The Source not found");
		}else{
			System.out.println("The Requested Source Item is price is :"+priceOfSource);
		}
		System.out.println("===================================================================================================================");
		String isAliveOrNot = Objects.isPersonAlive("elon musk");
		System.out.println("The Person name give is :"+isAliveOrNot);
	}
}