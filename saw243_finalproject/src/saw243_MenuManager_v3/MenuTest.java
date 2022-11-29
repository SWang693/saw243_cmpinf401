package saw243_MenuManager_v3;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entree chickenAndRice = new Entree("Chicken And Rice", "mild-flavored chicken and white rice", 448);
		Entree bonelessWings = new Entree("Boneless Wings", "5 piece bowl of buffalo drizzled boneless wings", 470);
		Side fries = new Side("French Fries", "fried potatoes seasoned with salt.", 365);
		Side onionRings = new Side("Onion Ring", "fried onion convered in sauce", 160);
		Salad caesarSalad = new Salad("Caesar Salad", " a green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice), olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.", 460);
		Dessert cheeseCake = new Dessert("Cheese Cake", "cake made from a mixture of cheese eggs and sugar", 257);
		Menu firstMenu = new Menu("First Menu", chickenAndRice, onionRings);
		Menu secondMenu = new Menu("Second Menu", bonelessWings, fries, caesarSalad, cheeseCake);
		// System.out.println(firstMenu.getName() + ": " + "Total Calories: " + firstMenu.totalCalories() + ", " + firstMenu.description() + '\n' +secondMenu.getName() + ": " + "Total Calories: " + secondMenu.totalCalories() + ", " + secondMenu.description());
		System.out.println(firstMenu.description());
		System.out.println(secondMenu.description());
	}

}