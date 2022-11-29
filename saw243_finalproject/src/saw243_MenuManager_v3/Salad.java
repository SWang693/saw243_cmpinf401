package saw243_MenuManager_v3;
/**
 * Class Salad
 * @author : Sam
 * @created: 10/11/2022
 */
public class Salad extends MenuItem{
	
	private String name;
	private String description;
	private int calories;
	
	public Salad(String name, String description, int calories, double price) {
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
	* @return description of salad
	*/
	public String getDescription() {
		if(this.description == null){
			return "N/A";
		}
		return description;	
	}
	/**
	* Method setDescription
	* @parameter description
	* @return none
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
