class SubRegionalPostOffice{
	static void deliver(String customerName, String address){
		System.out.println("Running deliver in SubRegionalPostOffice");
		System.out.println("Customer Name :"+customerName+" Address :"+address);
		RegionalPostOffice.deliver(customerName,address);
	}
}