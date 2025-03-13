class RegionalPostOffice{
	static void deliver(String customerName, String address){
		System.out.println("Running deliver in RegionalPostOffice");
		System.out.println("Customer Name :"+customerName+" Address :"+address);
		PostHeadMaster.post(customerName,address);
	}
}