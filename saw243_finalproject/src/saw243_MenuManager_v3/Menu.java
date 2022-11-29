package saw243_MenuManager_v3;
/**
 * Class Menu
 * @author : Sam
 * @created: 10/28/2022
 */
public class Menu {
	private String name;
	private Entree entree;	
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String name) {
		this.name = name;
		entree = null;
		salad = null;
		side = null;
		dessert = null;
	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.side = side;
		this.dessert = dessert;
	}
	/**
	* Method totalCalories
	* @parameter none
	* @return total calories in menu
	*/
	public int totalCalories() {
		/**
		* Method totalCalories
		* @parameter none
		* @return total calories of the menu items
		*/
		int allCalories = 0;
		if(entree !=null) {
			allCalories += entree.getCalories();
		}
		if(side != null) {
			allCalories += side.getCalories();
		}
		if(salad != null) {
			allCalories += salad.getCalories();
		}
		if(dessert != null) {
			allCalories += dessert.getCalories();
		}
		// int allCalories = entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
		return allCalories;
	}
	public String description() {
		/**
		* Method name: description
		* @parameter none
		* @return all descriptions of food and their names
		*/
		String allDescriptions = "";
		if(entree !=null) {
			allDescriptions += "Entree: " + entree.getName() + ": " + entree.getDescription() + " is price of " + entree.getPrice() + " and has this many calories: " + entree.getCalories() +"\n";
		}
		if(side != null) {
			allDescriptions += "Side: " + side.getName() + ": " + side.getDescription() + " is price of " + side.getPrice() + " and has this many calories: " + side.getCalories() + "\n";
		}
		if(salad != null) {
			allDescriptions += "Salad: " + salad.getName() + ": " + salad.getDescription() + " is price of " + salad.getPrice() + " and has this many calories: " + salad.getCalories() + "\n";
		}
		if(dessert != null) {
			allDescriptions += "Dessert: " + dessert.getName() + ": " + dessert.getDescription() + " is price of " + dessert.getPrice() + " and has this many calories: " + dessert.getCalories();
		}
		return allDescriptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	public String toString() {
		return name;
	}
}
