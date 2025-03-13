class Objects{
	static String getName(long mobileNo){	
    if (mobileNo == 9876543210L) {
        return "Rahul Sharma";
    } else if (mobileNo == 8765432109L) {
        return "Priya Verma";
    } else if (mobileNo == 7654321098L) {
        return "Aman Gupta";
    } else if (mobileNo == 6543210987L) {
        return "Neha Singh";
    } else if (mobileNo == 9432167890L) {
        return "Rohan Mehta";
    } else if (mobileNo == 8123456789L) {
        return "Pooja Yadav";
    } else if (mobileNo == 9012345678L) {
        return "Suresh Kumar";
    } else if (mobileNo == 7201234567L) {
        return "Kavita Rani";
    } else if (mobileNo == 6304598765L) {
        return "Vikram Bhatia";
    } else if (mobileNo == 5412367890L) {
        return "Anjali Nair";
    } else if (mobileNo == 8901234567L) {
        return "Manish Tiwari";
    } else if (mobileNo == 6789012345L) {
        return "Sneha Kapoor";
    } else if (mobileNo == 5678901234L) {
        return "Rajesh Malhotra";
    } else if (mobileNo == 4567890123L) {
        return "Meera Joshi";
    } else if (mobileNo == 3456789012L) {
        return "Ankit Saxena";
    } else if (mobileNo == 2345678901L) {
        return "Shreya Patel";
    } else if (mobileNo == 1234567890L) {
        return "Mohit Chawla";
    } else if (mobileNo == 9988776543L) {
        return "Deepika Sinha";
    } else if (mobileNo == 8877665432L) {
        return "Akash Deshmukh";
    } else if (mobileNo == 7766554321L) {
        return "Sunita Pandey";
    } else if (mobileNo == 6655443210L) {
        return "Tarun Iyer";
    } else if (mobileNo == 5544332109L) {
        return "Ritu Das";
    } else if (mobileNo == 4433221098L) {
        return "Chetan Kulkarni";
    } 
		return "Unkown Number";
	}
	
	static String getOwnerName(String companyName){
	if (companyName.equalsIgnoreCase("Tesla")) {
        return "Elon Musk";
    } else if (companyName.equalsIgnoreCase("Amazon")) {
        return "Jeff Bezos";
    } else if (companyName.equalsIgnoreCase("Microsoft")) {
        return "Bill Gates";
    } else if (companyName.equalsIgnoreCase("Facebook")) {
        return "Mark Zuckerberg";
    } else if (companyName.equalsIgnoreCase("Google")) {
        return "Larry Page & Sergey Brin";
    } else if (companyName.equalsIgnoreCase("Apple")) {
        return "Steve Jobs (Co-founder)";
    } else if (companyName.equalsIgnoreCase("SpaceX")) {
        return "Elon Musk";
    } else if (companyName.equalsIgnoreCase("Alibaba")) {
        return "Jack Ma";
    } else if (companyName.equalsIgnoreCase("Reliance Industries")) {
        return "Mukesh Ambani";
    } else if (companyName.equalsIgnoreCase("Oracle")) {
        return "Larry Ellison";
    } else if (companyName.equalsIgnoreCase("Netflix")) {
        return "Reed Hastings & Marc Randolph";
    } else if (companyName.equalsIgnoreCase("McDonald's")) {
        return "Ray Kroc";
	}
	return "Not Found";
	}
	
	
	static double getPrice(String foodItem){
	if (foodItem.equalsIgnoreCase("Burger")) {
        return 99.50;
    } else if (foodItem.equalsIgnoreCase("Pizza")) {
        return 299.00;
    } else if (foodItem.equalsIgnoreCase("Pasta")) {
        return 199.75;
    } else if (foodItem.equalsIgnoreCase("Sandwich")) {
        return 89.00;
    } else if (foodItem.equalsIgnoreCase("French Fries")) {
        return 149.50;
    } else if (foodItem.equalsIgnoreCase("Momos")) {
        return 120.00;
    } else if (foodItem.equalsIgnoreCase("Biryani")) {
        return 250.00;
    } else if (foodItem.equalsIgnoreCase("Ice Cream")) {
        return 80.00;
    } else if (foodItem.equalsIgnoreCase("Dosa")) {
        return 180.00;
    } else if (foodItem.equalsIgnoreCase("Tacos")) {
        return 160.50;
    } else if (foodItem.equalsIgnoreCase("Noodles")) {
        return 130.00;
    } else if (foodItem.equalsIgnoreCase("Coffee")) {
        return 70.00;
    } else if (foodItem.equalsIgnoreCase("Tea")) {
        return 50.00;
    } else if (foodItem.equalsIgnoreCase("Paneer Tikka")) {
        return 220.00;
    } else if (foodItem.equalsIgnoreCase("Samosa")) {
        return 40.00;
    } else if (foodItem.equalsIgnoreCase("Spring Rolls")) {
        return 140.00;
    } else if (foodItem.equalsIgnoreCase("Milkshake")) {
        return 110.00;
    } else if (foodItem.equalsIgnoreCase("Hot Dog")) {
        return 135.00;
    }
       return -1; 
	}
	
	
	static double getBalance(long accountNumber){
	if (accountNumber == 1001001001L) {
        return 50000.75;
    } else if (accountNumber == 1001001002L) {
        return 150000.00;
    } else if (accountNumber == 1001001003L) {
        return 25000.25;
    } else if (accountNumber == 1001001004L) {
        return 78000.50;
    } else if (accountNumber == 1001001005L) {
        return 120000.00;
    } else if (accountNumber == 1001001006L) {
        return 35000.80;
    } else if (accountNumber == 1001001007L) {
        return 92000.45;
    } else if (accountNumber == 1001001008L) {
        return 110000.60;
    } else if (accountNumber == 1001001009L) {
        return 67000.30;
    } else if (accountNumber == 1001001010L) {
        return 89000.90;
    } else if (accountNumber == 1001001011L) {
        return 43000.75;
    } else if (accountNumber == 1001001012L) {
        return 140000.20;
    } else if (accountNumber == 1001001013L) {
        return 60000.65;
    } else if (accountNumber == 1001001014L) {
        return 75000.40;
    } else if (accountNumber == 1001001015L) {
        return 95000.10;
    } else if (accountNumber == 1001001016L) {
        return 105000.55;
    } else if (accountNumber == 1001001017L) {
        return 30000.35;
    }
		return -1;
	}
	
	static double getPriceBySource(String sourceName){
	if (sourceName.equalsIgnoreCase("Gold")) {
        return 60000.00;
    } else if (sourceName.equalsIgnoreCase("Silver")) {
        return 750.50;
    } else if (sourceName.equalsIgnoreCase("Crude Oil")) {
        return 6200.75;
    } else if (sourceName.equalsIgnoreCase("Coal")) {
        return 150.00;
    } else if (sourceName.equalsIgnoreCase("Natural Gas")) {
        return 80.25;
    } else if (sourceName.equalsIgnoreCase("Iron Ore")) {
        return 7000.60;
    } else if (sourceName.equalsIgnoreCase("Copper")) {
        return 850.90;
    } else if (sourceName.equalsIgnoreCase("Aluminium")) {
        return 230.45;
    } else if (sourceName.equalsIgnoreCase("Steel")) {
        return 920.80;
    } else if (sourceName.equalsIgnoreCase("Cotton")) {
        return 220.30;
    } else if (sourceName.equalsIgnoreCase("Wheat")) {
        return 30.75;
    } else if (sourceName.equalsIgnoreCase("Rice")) {
        return 45.90;
    } else if (sourceName.equalsIgnoreCase("Sugar")) {
        return 40.10;
    } else if (sourceName.equalsIgnoreCase("Tea")) {
        return 150.20;
    } else if (sourceName.equalsIgnoreCase("Coffee")) {
        return 500.40;
    } else if (sourceName.equalsIgnoreCase("Petrol")) {
        return 110.00;
    } else if (sourceName.equalsIgnoreCase("Diesel")) {
        return 95.50;
    } else if (sourceName.equalsIgnoreCase("Platinum")) {
        return 32000.00;
    } else if (sourceName.equalsIgnoreCase("Diamond")) {
        return 100000.00;
    } else if (sourceName.equalsIgnoreCase("Timber")) {
        return 5000.75;
    }
        return -1; 
	}
	
	static String isPersonAlive(String name){
	if (name.equalsIgnoreCase("Elon Musk")) {
        return "Alive";
    } else if (name.equalsIgnoreCase("Bill Gates")) {
        return "Alive";
    } else if (name.equalsIgnoreCase("Steve Jobs")) {
        return "Not Alive";
    } else if (name.equalsIgnoreCase("Albert Einstein")) {
        return "Not Alive";
    } else if (name.equalsIgnoreCase("Mark Zuckerberg")) {
        return "Alive";
    } else if (name.equalsIgnoreCase("Nelson Mandela")) {
        return "Not Alive";
    } else if (name.equalsIgnoreCase("Ratan Tata")) {
        return "Not Alive";
    } else if (name.equalsIgnoreCase("Mahatma Gandhi")) {
        return "Not Alive";
    }
        return "Unknown";
	}
}