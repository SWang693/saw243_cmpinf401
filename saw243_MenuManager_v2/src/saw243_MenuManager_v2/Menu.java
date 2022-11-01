package saw243_MenuManager_v2;

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

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		side = null;
		dessert = null;
	}
	public Menu(String name, Entree entree, Salad salad, Side side, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.side = side;
		this.dessert = dessert;
	}
	public int totalCalories() {
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
		String allDescriptions = "";
		if(entree !=null) {
			allDescriptions += "Entree: " + entree.getDescription() + " ";
		}
		if(side != null) {
			allDescriptions += "Side: " + side.getDescription() + " ";
		}
		if(salad != null) {
			allDescriptions += "Salad: " + salad.getDescription() + " ";
		}
		if(dessert != null) {
			allDescriptions += "Dessert: " + dessert.getDescription();
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

}
