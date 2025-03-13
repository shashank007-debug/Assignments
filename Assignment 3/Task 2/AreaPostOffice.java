class AreaPostOffice{
	static void deliver(String customerName, String address){
		System.out.println("Running deliver in AreaPostOffice");
		System.out.println("Customer Name :"+customerName+" Address :"+address);
		SubRegionalPostOffice.deliver(customerName,address);
	}
}