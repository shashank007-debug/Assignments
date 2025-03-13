class PostHeadMaster{
	static void post(String customerName, String address){
		System.out.println("Running post in post Head Master");
		System.out.println("Customer Name :"+customerName+" Address :"+address);
		PostMaster.post(customerName,address);
	}
}