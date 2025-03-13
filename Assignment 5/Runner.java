class Runner{
	public static void main(String[] args){
		String[] emails = {"shashankmn066@gmail.com","shashankmn0077@gmail.com","shashankmn.xworkz@outlook.com"};
		SetOperation.printEmail(emails);
		System.out.println("==================================================================================");
		String[] countries = {"India","Germany","Australia","USA"};
		SetOperation.printCountries(countries);
		System.out.println("==================================================================================");
		char[] aplhabets = {'z','a','d','u','f','x','y'};
		SetOperation.printAlphabets(aplhabets);
		System.out.println("==================================================================================");
		String ingredients = SetOperation.getIngredients(args[0]);
		System.out.println("Ingredients of "+args[0]+" Food Item are : "+ingredients);
		
	}
}