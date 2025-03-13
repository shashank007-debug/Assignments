//PostRunner.main---> AreaPostOffice.deliver(customername,address)--> SubRegionalPostOffice.deliver(customername,address)-->
//RegionalPostOffice.deliver(customername,address)--->PostHeadMaster(customername,address)---->PostMaster(customername,address)

class PostMaster{
	static void post(String customerName, String address){
		System.out.println("Running post in post Master");
		System.out.println("Customer Name :"+customerName+" Address :"+address);
	}
}