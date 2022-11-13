package saw243_MenuManager_v3;
/**
 * Class Dessert
 * @author : Sam
 * @created: 10/11/2022
 */
public class Dessert extends MenuItem{
	
	private String name;
	private String description;
	private int calories;
	
	public Dessert(String name, String description, int calories, double price) {
		super(name, description, calories, price);
		// TODO Auto-generated method stub
	}

	public String getName() {
		if(this.name == null){
			return "N/A";
		}
		return name;
	}

	public void setName(String name) {
		if(name == null){
			return;
		}
		this.name = name;
	}
	/**
	* Method getDescription
	* @parameter none
	* @return description of dessert
	*/
	public String getDescription() {
		if(this.description == null){
			return "N/A";
		}
		return description;	
	}
	/**
	* Method set Description
	* @parameter description
	* @return nothing
	*/
	public void setDescription(String description) {
		if(description == null){
			return;
		}
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}