import java.util.Arrays;
class SetOperation{
	public static void printEmail(String[] emails){
		for(String email : emails){
			System.out.println(email);
		}
	}
	
	public static void printCountries(String[] countries){
		for(String country: countries){
			if(country.endsWith("a") || country.endsWith("A")){
				System.out.println("Country ending with alphabet 'a' : "+country);
			}
		}
	}
	
	public static void printAlphabets(char[] alphabets){
		Arrays.sort(alphabets);
		for(char alphabet : alphabets){
			System.out.print(alphabet+" ");
		}
		System.out.println();
	}
	
	public static String getIngredients(String foodItem){
		if (foodItem.equalsIgnoreCase("Pizza")) {
            return "Dough, Cheese, Tomato Sauce";
        } else if (foodItem.equalsIgnoreCase("Burger")) {
            return "Bun, Patty, Lettuce, Cheese";
        } else if (foodItem.equalsIgnoreCase("Pasta")) {
            return "Pasta, Sauce, Parmesan";
        } else {
            return "No ingredients found";
		}
	}
} 