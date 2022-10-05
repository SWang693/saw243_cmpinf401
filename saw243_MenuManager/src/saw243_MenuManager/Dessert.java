package saw243_MenuManager;

public class Dessert {
	
	private String name;
	private String description;
	private int calories;
	
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		// TODO Auto-generated method stub
	}

	public String getName() {
		if(this.name == null){
			return "No Dessert";
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		if(this.name == null){
			return "";
		}
		return description;	
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}
